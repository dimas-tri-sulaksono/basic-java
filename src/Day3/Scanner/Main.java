package Day3.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // import scanner dari java buat bikin inputan terminal
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nama : ");
        String nama = input.nextLine();

        System.out.println("");
        int age = input.nextInt();

        System.out.println("");
        String kelas = input.nextLine();


        System.out.println("Halo, "+ nama +" umur "+ age +" kelas "+ kelas);

        // buat nutup inputan
        input.close();
    }
}
