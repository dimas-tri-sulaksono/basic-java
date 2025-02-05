package Day1.Basic;

/* JAVA : bahasa programming OOP (Object Oriented Programming)
 * setiap class yag dibuat di dalam file java mewakili suatu object
 */

import java.util.Arrays;
import java.util.Objects;

public class Basic {
    public static void main(String[] args) {
        // variable : wadah untuk menyimpan data
        // tipe data : jenis data yang disimpan di dalam variable
        // cara membuat variable:
        // <tipe data> <variable name> = isi data;

        String name = "Dimas"; // string
        int age = 26; // integer

        Boolean isStudent = false;

        System.out.println("nama aku " + name + " umurku " + age + " dan status siswaku " +isStudent);

        // array di JAVA punya ukuran data yang statis, ngga bisa sembarangan ubah (tambah datanya) dan cuma bisa nyimpen 1 tipe data
        System.out.println("===Array===");
        int[] numbers = {1,2,3,4,5};
        // System.out.println("Array length : "+ numbers.length);
        numbers[4] = 7;

        // looping tradisional
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("array ke - "+i);
        }

        // Integer : tipe data yang bisa dimanipulasi pake method-method array
        Integer integerNumber = 25;
        System.out.println("Integer : "+ integerNumber);

        // object : tipe data campuran
        Object[] dataCampuran = {"dimas", 26};
        // enhanced looping
        for (Object i : dataCampuran){
            System.out.println("data campuran : "+ i);
        }
        // tipe data angka yang ukuran/kapasitasnya lebih gede dibanding int
        long longNumber = 123;
        System.out.println(longNumber);
        // tipe data untuk
        double doubleNumber = 10.2;
        float floatNumber = 10;

        // concatenation : method untuk gabungin 2 string
        String fristName = "Dimas";
        String lastName = "Sulaksono";
        String middleName = "Tri";
        System.out.println("basic : " + fristName + " " + lastName);
        System.out.println("concat: " + fristName.concat(" "+lastName.concat(" "+middleName)));

        // ENUM : buat nyimpen nilai-nilai konstan yang gak bisa diubah
        enum Grade {
            Lulus,
            Tidak_Lulus
        }
        System.out.println(" : "+ Grade.Lulus);
        System.out.println(" : "+ Grade.Tidak_Lulus);


    }
}
