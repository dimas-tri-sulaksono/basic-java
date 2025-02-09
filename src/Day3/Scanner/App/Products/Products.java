package Day3.Scanner.App.Products;

import java.io.*;
import java.util.*;

public class Products {
    public String name;
    public double price;
    public String category;

    public Products(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // inner class
    public static class ProductController{
        private final List<Products> productsList;

        public ProductController(){
            productsList = new ArrayList<>();
        }

        // method
        public void addProduct(Products product){
            productsList.add(product);
        }

        public void displayAllProducts(){
            if(!productsList.isEmpty()){
                for (Products product : productsList){
                    System.out.println("nama: "+ product.name +", price: "+ product.price +", category: "+ product.category);
                }
            } else {
                System.out.println("product tidak tersedia");
            }
        }

        public void sortByPrice(){
            if(!productsList.isEmpty()){
                productsList.sort(Comparator.comparing(product -> product.price));
                for (Products product : productsList){
                    System.out.println("nama: "+ product.name +", price: "+ product.price +", category: "+ product.category);
                }
            } else {
                System.out.println("product tidak tersedia");
            }
        }

        public void searchProduct(String cari){
            if(!productsList.isEmpty()){
                for (Products product : productsList){
                    if (cari.toLowerCase().equals(product.name.toLowerCase())){
                        System.out.println("nama: "+ product.name +", price: "+ product.price +", category: "+ product.category);
                    }
                }
            } else {
                System.out.println("product tidak tersedia");
            }
        }

        String filePath = "C:\\_aigen\\_mainClass\\backend\\basic_java\\src\\Day3\\Scanner\\App\\Products\\products_list.txt";
        File file = new File(filePath);

        public void saveProducts(){
            if(!productsList.isEmpty()){


                try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    for (Products product : productsList){
                        writer.write("nama: "+ product.name +", price: "+ product.price +", category: "+ product.category +"\n");
                    }
                    System.out.println("\nFile berhasil dibuat\npath : " + file.getAbsolutePath());
                } catch (IOException e){
                    throw new RuntimeException(e);
                }

            } else {
                System.out.println("product tidak tersedia");
            }
        }

        public void readProductFile(){
            System.out.println("\nmembaca file product list :");
            try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
                String line;
                while((line = reader.readLine()) != null){
                    System.out.println(line);
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}
