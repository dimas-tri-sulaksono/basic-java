package Day3.Scanner;

import java.util.Scanner;

public class Siswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa : ");
        int jumlahSiswa = input.nextInt();

        String[] namaSiswa = new String[jumlahSiswa];
        int[] umurSiswa = new int[jumlahSiswa];
        String[] kelas = new String[jumlahSiswa];
        double[] nilai = new double[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("\ndata siswa ke-"+ (i+1) +"\n");
            input.nextLine();

            System.out.print("nama : ");
            namaSiswa[i] = input.nextLine();

            System.out.print("umur : ");
            umurSiswa[i] = input.nextInt();
            input.nextLine();

            System.out.print("kelas : ");
            kelas[i] = input.nextLine();

            System.out.print("nilai : ");
            nilai[i] = input.nextDouble();
        }

        double nilaiTotal = 0;
        for (int i = 0; i < jumlahSiswa; i++) {
            nilaiTotal += nilai[i];
        }

        double nilaiRata = nilaiTotal / jumlahSiswa;
        System.out.println("rata-rata nilai siswa : "+ nilaiRata);
    }
}
