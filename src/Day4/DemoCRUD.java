package Day4;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class DemoCRUD {
    String url = "jdbc:postgresql://localhost:5432/bootcamp";
    String username = "postgres";
    String password = "root";

    Scanner input = new Scanner(System.in);

    public void getData(){
        try {
            // DriverManager.getConnection : buat ngehubungin ke database
            Connection connection = DriverManager.getConnection(url, username, password);

            // panggil object Statement buat ngeksekusi query
            Statement statement = connection.createStatement();

            // panggil ResultSet buat nampung hasil eksekusi query
            ResultSet resultSet = statement.executeQuery("select * from products");

            // buat ambil kolom dan tipe data dari tiap kolom
            ResultSetMetaData metaData = resultSet.getMetaData();

            // ambil jumlah kolomm
            int columnCount =metaData.getColumnCount();

            // ObjectMapper : mapping data ke format JSON
            ObjectMapper mapper = new ObjectMapper(); // bikin object kosong

            // ArrayNode : uat nampung data ke array of object (JSON)
            ArrayNode arrNode = mapper.createArrayNode(); // bikin array kosong

            while(resultSet.next()){
                // buat data bject untuk setiap baris data
                ObjectNode objNode = mapper.createObjectNode();
                for(int i = 1; i <= columnCount; i++){
                    String columnName = metaData.getColumnName(i);
                    objNode.put(columnName,resultSet.getString(i));
                }
                // masukin data object yang udah dilooping ke array
                arrNode.add(objNode);
            }

            // buat format data ke format JSON yang lebih kecil
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(arrNode);
            System.out.println(jsonString);

        } catch (SQLException | com.fasterxml.jackson.core.JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void addData(){
        System.out.println("Masukkan nama product : ");
        String name = input.nextLine();

        System.out.println("Masukkan harga product : ");
        double price = input.nextDouble();
        input.nextLine();

        System.out.println("Masukkan kategori product : ");
        String category = input.nextLine();

        try{
            // DriverManager.getConnection : buat ngehubungin ke database
            Connection connection = DriverManager.getConnection(url, username, password);

            // PreparedStatement untuk mengeksekusi quey yang punya jumlah data banyak. (?, ?, ?) pada value buat cegah SQL injection
            PreparedStatement preparedStatement =connection.prepareStatement("insert into products (product_name, product_price, category) values (?,?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, price);
            preparedStatement.setString(3, category);

            preparedStatement.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void editData(){
        System.out.println("Masukkan ID product : ");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("Masukkan nama product : ");
        String name = input.nextLine();

        System.out.println("Masukkan harga product : ");
        double price = input.nextDouble();
        input.nextLine();

        System.out.println("Masukkan kategori product : ");
        String category = input.nextLine();

        try{
            // DriverManager.getConnection : buat ngehubungin ke database
            Connection connection = DriverManager.getConnection(url, username, password);

            // PreparedStatement untuk mengeksekusi quey yang punya jumlah data banyak. (?, ?, ?) pada value buat cegah SQL injection
            PreparedStatement preparedStatement =connection.prepareStatement("update products set product_name = ?, product_price = ?, category = ? where id =?");
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, price);
            preparedStatement.setString(3, category);
            preparedStatement.setInt(4, id);

            // eksekusi query
            int rowsUpdated = preparedStatement.executeUpdate();

            // kondisi untuk cek apa ada data yang diupdate
            if(rowsUpdated > 0){
                System.out.println("data berhasil diupdate!");
            } else {
                System.out.println("data dengan id "+ id +" tidak ditemukan");
            }

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void deleteData(){
        System.out.println("Masukkan ID product : ");
        int id = input.nextInt();
        input.nextLine();

        try{
            // DriverManager.getConnection : buat ngehubungin ke database
            Connection connection = DriverManager.getConnection(url, username, password);

            // PreparedStatement untuk mengeksekusi quey yang punya jumlah data banyak. (?, ?, ?) pada value buat cegah SQL injection
            PreparedStatement preparedStatement =connection.prepareStatement("DELETE FROM products WHERE id = ?");
            preparedStatement.setInt(1, id);

            // eksekusi query
            int rowsDeleted = preparedStatement.executeUpdate();

            // kondisi untuk cek apa ada data yang dihapus
            if(rowsDeleted > 0){
                System.out.println("data berhasil dihapus!");
            } else {
                System.out.println("data dengan id "+ id +" tidak ditemukan");
            }

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void addOrder(){
        System.out.println("Masukkan id product : ");
        int product_id = input.nextInt();
        input.nextLine();

        System.out.println("Masukkan jumlah produk : ");
        int qty = input.nextInt();
        input.nextLine();

        try{
            // DriverManager.getConnection : buat ngehubungin ke database
            Connection connection = DriverManager.getConnection(url, username, password);

            // PreparedStatement untuk mengeksekusi quey yang punya jumlah data banyak. (?, ?, ?) pada value buat cegah SQL injection
            PreparedStatement preparedStatement =connection.prepareStatement("insert into orders (product_id, quantity, order_date) values (?,?,?)");
            preparedStatement.setInt(1, product_id);
            preparedStatement.setInt(2, qty);
            preparedStatement.setDate(3, Date.valueOf(LocalDate.now()));

            // eksekusi query
            int rowsUpdated = preparedStatement.executeUpdate();

            // kondisi untuk cek apa ada data yang diupdate
            if(rowsUpdated > 0){
                System.out.println("order berhasil ditambahkan!");
            } else {
                System.out.println("product dengan id "+ product_id +" tidak ditemukan");
            }

        } catch (SQLException e){
            //throw new RuntimeException(e);
            System.out.println("ID product tidak ada");
        }
    }

    public static void main(String[] args) {
        DemoCRUD demo = new DemoCRUD();
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("============== Menu ==============");
            System.out.println("1. View all products");
            System.out.println("2. Add new products");
            System.out.println("3. Edit products");
            System.out.println("4. Delete products");
            System.out.println("5. Order products");
            System.out.println("0. Exit");
            System.out.println("pilih menu : ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu){
                case 1:
                    demo.getData();
                    break;
                case 2:
                    demo.addData();
                    break;
                case 3:
                    demo.editData();
                    break;
                case 4:
                    demo.deleteData();
                    break;
                case 5:
                    demo.addOrder();
                    break;
                case 0:
                    System.out.println("Thank you, have a good day!");
                    input.close();
                    return; // return kosong buat ngeclose input
                default:
                    System.out.println("input tidak valid");
            }
        }
    }
}
