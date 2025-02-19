package Day1.Test;

import java.util.ArrayList;

public class Day1Test {
    public static void main(String[] args) {
        /* 1. buat logic untuk mengecek apakah sebuah bilangan adalah bilangan prima atau bukan */
                int i =0;
                int num =0;
                int cekSampaiAngkaBerapa = 25;

               String  primeNumbers = "";

                for (i = 1; i <= cekSampaiAngkaBerapa; i++)
                {
                    int counter=0;
                    for(num =i; num>=1; num--)
                    {
                        if(i%num==0)
                        {
                            counter = counter + 1;
                        }
                    }
                    if (counter ==2)
                    {
                        primeNumbers = primeNumbers + i + " ";
                    }
                }
                System.out.println("\nbilangan prima dari 1 sampai "+ cekSampaiAngkaBerapa +" adalah :");
                System.out.println(primeNumbers);

        /* 2. buat logic untuk nyari nilai terbesar dan terkecil dari sebuah array pake math method */
        int[] angka = {1,2,3,4,5,6,7,8,9,10};
        int max = 1;
        int min = 1;

        for (int soal2 = 1; soal2 < angka.length; soal2++) {
            max = Math.max(max ,angka[soal2]);
            min = Math.min(min ,angka[soal2]);
        }

        System.out.println("\nnilai terbesar : "+ max);
        System.out.println("nilai terkecil : "+ min);

        /* 3. buat logic untuk nyari jumlah elemen yang nilainya genap dan jumlah elemen yang nilainya ganjil dari array angka */
        ArrayList<Integer> genap = new ArrayList<>();
        for (int number : angka) {
            if (number % 2 == 0) {
                genap.add(number);
            }
        }
        System.out.println("\njumlah elemen dengan nilai genap : "+ genap.size() + " elemen");
        System.out.println("jumlah elemen dengan nilai ganjil : "+ (angka.length - genap.size()) + " elemen");

        /* 4. buat logic untuk menghitung jumlah karakter dalam sebuah string */
        String kata = "aku sedang belajar java";
        System.out.println("jumlah karakter dalam string \""+ kata +"\" adalah "+ kata.length() +" huruf");

        /* 5. buat logic untuk menghitung jumlah huruf vokal dalam string 'kata' */
        int v;
        int vokal = 0;
        for (v=0;v<kata.length();v++)
        {
            if (kata.charAt(v) == 'a' || kata.charAt(v) == 'e' || kata.charAt(v) == 'i' || kata.charAt(v) == 'o' || kata.charAt(v) == 'u')
            {
                vokal++;
            }

        }
        System.out.println("\njumlah huruf vokal dalam string \""+ kata +"\" adalah "+ vokal +" huruf");

        /* 6. buat array yag tediri dari 5 mahasiswa, masing-masing punya 3 nilai: ujian, absen, kuis
        *     kalkulasi nilai mereka berdasarkan rata-rata nilai dari 3 nilai tersebut
        *     lalu tentukan Grade mereka berdasarkan nilai rata-rata menggunakan logic if-else dan ENUM */

        Double [][][] mahasiswa = {
                {
                    {70.0,60.0,80.0}
                },
                {
                    {90.0,70.0,50.0}
                },
                {
                    {83.0,85.0,87.0}
                },
                {
                    {90.0,95.0,100.0}
                },
                {
                    {73.0,85.0,81.0}
                }
        };

        enum Grade {
            Lulus,
            Tidak_Lulus
        }

        ArrayList<Double> daftarNilai = new ArrayList<>();

        // cara nambahin data / elemen ke dalam arraylist
        Double sum = 0.0;
        for (int j = 0; j < mahasiswa.length; j++) {
            for (int k = 0; k < mahasiswa[j][0].length; k++) {
                sum = sum + mahasiswa[j][0][k];
            }
            daftarNilai.add(sum);
            sum = 0.0;
        }

        for (int j = 0; j < daftarNilai.size(); j++) {
             daftarNilai.set(j, daftarNilai.get(j)/3);
        }

        System.out.println("\nnilai : "+daftarNilai);

        for (double gradeMhs : daftarNilai){
            if(gradeMhs >= 85.0 ){
                System.out.println("selamat kamu "+ Grade.Lulus);
            } else {
                System.out.println("sayang sekali kamu "+ Grade.Tidak_Lulus);
            }
        }


    }
}
