package Day5;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MainMenu {
    static String url = "jdbc:postgresql://localhost:5432/test";
    static String username = "postgres";
    static String password = "root";

    Scanner input = new Scanner(System.in);

    public void getData(String table){
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from "+ table);
            ResultSetMetaData metaData = resultSet.getMetaData();

            int columnCount = metaData.getColumnCount();
            ObjectMapper mapper = new ObjectMapper();
            ArrayNode arrNode = mapper.createArrayNode();

            while(resultSet.next()){
                ObjectNode objNode = mapper.createObjectNode();
                for(int i = 1; i <= columnCount; i++){
                    String columnName = metaData.getColumnName(i);
                    objNode.put(columnName,resultSet.getString(i));
                }
                arrNode.add(objNode);
            }

            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(arrNode);
            System.out.println(jsonString);

        } catch (SQLException | com.fasterxml.jackson.core.JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void addDataProduct() {
        System.out.print("Masukkan nama product : ");
        String name = input.nextLine();

        System.out.print("Masukkan harga product : ");
        double price = input.nextDouble();
        input.nextLine();

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("select id, category_name from categories");
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Integer> validCategory = new ArrayList<>();
            System.out.println("\nDaftar kategori:");
            while (resultSet.next()) {
                int catId = resultSet.getInt("id");
                String catName = resultSet.getString("category_name");
                validCategory.add(catId);
                System.out.println("ID: "+ catId + " [" + catName +"]");
            }

            int categoryId;
            while (true) {
                System.out.print("\nMasukkan ID kategori: ");
                categoryId = input.nextInt();
                input.nextLine();

                if (validCategory.contains(categoryId)) { break; }
                System.out.println("ID kategori tidak valid!");
            }

            preparedStatement = connection.prepareStatement("insert into products (product_name, product_price, categories_id) VALUES (?,?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, price);
            preparedStatement.setInt(3, categoryId);

            preparedStatement.executeUpdate();
            System.out.println("Data product berhasil ditambahkan!");

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void updateDataProduct(){
        System.out.print("Masukkan ID product : ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan harga product : ");
        double price = input.nextDouble();
        input.nextLine();

        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("update products set product_price = ? where id =?");
            preparedStatement.setDouble(1, price);
            preparedStatement.setInt(2, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void addDataCustomer(){
        System.out.print("Masukkan nama customer : ");
        String name = input.nextLine();

        System.out.print("Masukkan alamat customer : ");
        String address = input.nextLine();

        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into customers (customer_name, customer_address) values (?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, address);

            preparedStatement.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void updateDataCustomer(){
        System.out.print("Masukkan ID customer : ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan alamat customer : ");
        String address = input.nextLine();

        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("update customers set customer_address = ? where id = ?");
            preparedStatement.setString(1, address);
            preparedStatement.setInt(2, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void deleteData(String table){
        System.out.print("Masukkan ID yang ingin dihapus : ");
        int id = input.nextInt();
        input.nextLine();

        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("delete from "+ table +" where id = ?");
            preparedStatement.setInt(1, id);

            int rowsDeleted = preparedStatement.executeUpdate();
            if(rowsDeleted > 0){
                System.out.println("data berhasil dihapus!");
            } else {
                System.out.println("data dengan id "+ id +" tidak ditemukan");
            }

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        MainMenu menuUtama = new MainMenu();
        Scanner input = new Scanner(System.in);

        // Menu
        while(true){
            System.out.println("\n=====HOME=====");
            System.out.println("1. Menu Produk");
            System.out.println("2. Menu Customer");
            System.out.println("0. Exit");
            System.out.println("==============");
            System.out.print("Pilih menu : ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu){
                case 1:
                    while (true){
                        System.out.println("\n=====MENU PRODUK=====");
                        System.out.println("1. Tambah Produk");
                        System.out.println("2. Update Produk");
                        System.out.println("3. Hapus Produk");
                        System.out.println("4. Lihat Produk");
                        System.out.println("0. Exit");
                        System.out.println("==============");
                        System.out.print("Pilih menu : ");
                        int menuProduk = input.nextInt();
                        input.nextLine();

                        switch (menuProduk){
                            case 1:
                                System.out.println("\n=====ADD PRODUCT======");
                                menuUtama.addDataProduct();
                                break;
                            case 2:
                                System.out.println("\n=====UPDATE PRODUCT======");
                                menuUtama.updateDataProduct();
                                break;
                            case 3:
                                System.out.println("\n=====DELETE PRODUCT======");
                                menuUtama.deleteData("products");
                                break;
                            case 4:
                                System.out.println("\n=====VIEW PRODUCT======");
                                menuUtama.getData("products");
                                break;
                            case 0:
                                System.out.println("Kembali ke menu awal...");
                                break;
                            default:
                                System.out.println("input tidak valid");
                                break;
                        }
                        if(menuProduk == 0) break;
                    }
                    break;
                case 2:
                    while (true){
                        System.out.println("\n=====MENU CUTOMER=====");
                        System.out.println("1. Tambah Customer");
                        System.out.println("2. Update Customer");
                        System.out.println("3. Hapus Customer");
                        System.out.println("4. Lihat Customer");
                        System.out.println("0. Exit");
                        System.out.println("==============");
                        System.out.print("Pilih menu : ");
                        int menuCustomer = input.nextInt();
                        input.nextLine();

                        switch (menuCustomer){
                            case 1:
                                System.out.println("\n=====ADD CUSTOMER======");
                                menuUtama.addDataCustomer();
                                break;
                            case 2:
                                System.out.println("\n=====UPDATE CUSTOMER======");
                                menuUtama.updateDataCustomer();
                                break;
                            case 3:
                                System.out.println("\n=====DELETE CUSTOMER======");
                                menuUtama.deleteData("customers");
                                break;
                            case 4:
                                System.out.println("\n=====VIEW CUSTOMER======");
                                menuUtama.getData("customers");
                                break;
                            case 0:
                                System.out.println("Kembali ke menu awal...");
                                break;
                            default:
                                System.out.println("input tidak valid");
                                break;
                        }
                        if(menuCustomer == 0) break;
                    }
                    break;
                case 0:
                    System.out.println("Terimakasih, sampai jumpa!");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Menu yang anda pilih tidak tersedia");
                    break;
            }
        }
    }
}