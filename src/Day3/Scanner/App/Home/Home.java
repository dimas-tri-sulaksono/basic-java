package Day3.Scanner.App.Home;

import Day3.Scanner.App.Products.ProductMain;
import Day3.Scanner.App.Products.Products;
import Day3.Scanner.App.Review.ReviewMain;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU ===");
        System.out.println("- Login");
        System.out.println("- Register");
        System.out.println("- Products");
        System.out.println("- Cart");
        System.out.println("- Review");
        System.out.println("Pilih menu: ");
        // convert inputan ke huruf kapital
        Menu myMenu = Menu.valueOf(input.nextLine().toUpperCase());

        switch (myMenu){
            case LOGIN :
                System.out.println("Login Success!");
                break;
            case REGISTER:
                System.out.println("Register Success!");
                break;
            case PRODUCTS:
                //System.out.println("Halaman Produk");
                ProductMain.main();
                break;
            case CART:
                System.out.println("Tampil Cart");
                break;
            case REVIEW:
                System.out.println("Halaman Review");
                ReviewMain.main();
                // buat menu review yang bisa nambahin nama reviewer dan rating, kemudian tampilan semua reviewnya
                break;
            default:
                System.out.println("Input Invalid!");
                break;
        }
    }
}