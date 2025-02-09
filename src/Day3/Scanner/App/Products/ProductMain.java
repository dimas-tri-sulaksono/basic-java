package Day3.Scanner.App.Products;

import java.util.Scanner;

public class ProductMain {
    public static void main() {
        Products.ProductController productController = new Products.ProductController();

        Scanner input = new Scanner(System.in);
        System.out.println("apakah anda ingin menambahkan produk baru? (Y/N) : ");
        String addProductChoice = input.nextLine().toLowerCase();

        if(addProductChoice.equals("y")){
            System.out.println("masukkan jumlah produk : ");
            int jumlahProduk = input.nextInt();
            input.nextLine();

            for (int i = 0; i < jumlahProduk; i++) {
                System.out.print("nama : ");
                String nama = input.nextLine();

                System.out.print("harga : ");
                Double harga= input.nextDouble();
                input.nextLine();

                System.out.print("kategori : ");
                String kategori = input.nextLine();

                Products products = new Products(nama, harga, kategori);

                productController.addProduct(products);
            }
        }

        System.out.println("=== PRODUCT LIST ===");
        productController.displayAllProducts();

        /* buat method lainnya di Product.java */

        System.out.println("\n=== SORT PRODUCTS BY PRICE ===");
        productController.sortByPrice();

        System.out.println("\n==============================");

        System.out.println("Apakah anda ingin mencari product? (Y/N) : ");
        String searchProduct = input.nextLine().toLowerCase();
        // method & logic untuk nyari product berdasarkan nama
        if(searchProduct.equals("y")){
            System.out.println("masukkan masukkan nama produk : ");
            String productName = input.nextLine();
            productController.searchProduct(productName);
        }

        // buat method save product ke file
        System.out.println("\n==============================");
        productController.saveProducts();

        // buat method read file product
        System.out.println("\n==============================");
        productController.readProductFile();
    }
}
