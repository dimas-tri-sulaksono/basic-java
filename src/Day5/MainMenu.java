package Day5;

import java.util.Scanner;

public class MainMenu {
    String url = "jdbc:postgresql://localhost:5432/test";
    String username = "postgres";
    String password = "root";

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Menu
        while(true){
            System.out.println("=====HOME=====");
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
                        System.out.println("=====MENU PRODUK=====");
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
                                System.out.println("=====ADD PRODUCT======");
                                // panggil method add product
                                System.out.println("======================");

                                // case 2,3 dst ...
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
                        System.out.println("=====MENU CUTOMER=====");
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
                                System.out.println("=====ADD CUSTOMER======");
                                // panggil method add customer
                                System.out.println("======================");

                                // case 2,3 dst ...
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