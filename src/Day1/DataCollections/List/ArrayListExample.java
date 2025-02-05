package Day1.DataCollections.List;

import java.util.ArrayList;

/* array list : implementasi dari interface list yang fungsinya buat nyimpen data berbentuk array
*  ArrayList biasanya dipake buat nyimpen data kompleks seperti oject
*  kelebihan array list dibanding array biasa adalah kemudahan untuk memanipulasi datanya
*  represesntasi kayak JSON*/

public class ArrayListExample {
    public static void main(String[] args) {
        // array biasa
        int[] arrayBiasa = new int[5];
        arrayBiasa[0] = 10;
        arrayBiasa[1] = 20;

        // array list
        ArrayList<String> daftarNama = new ArrayList<>();

        // cara nambahin data / elemen ke dalam arraylist
        daftarNama.add("dimas");
        daftarNama.add("tri");
        daftarNama.add("sulaksono");

        // cara nambahin elemen di indeks tertentu
        daftarNama.add(3, "master");

        System.out.println("data : "+ daftarNama.get(0));

        // ubah elemen
        daftarNama.set(3, "super master");

        // hapus elemen
        daftarNama.remove(1);

        // ngitung jumlah elemen
        System.out.println("jumlah data : "+ daftarNama.size());

        // cek apakah array list kosong
        System.out.println("apakah array list kosong? "+ daftarNama.isEmpty());

        // cek apakah elemen tertentu ada di dalam array list
        System.out.println("nama Dimas ada di dalam daftar? "+ daftarNama.contains("Dimas"));

        // ngambil indek di element tertentu
        System.out.println("indeks Dimas : "+ daftarNama.indexOf("Dimas"));

        // menampilkan semua elemen dalam array list
        System.out.println("daftar nama : "+ daftarNama);

        // menampilkan semua daya pakai looping
        for (String nama : daftarNama){
            System.out.println(nama);
        }

        // buat array list dengan tipe data yang berbeda
        ArrayList<Object> dataRandom = new ArrayList<>();
        dataRandom.add("Dimas");
        dataRandom.add(26);
        dataRandom.add(true);
        dataRandom.add(12000000);

        for (Object data : dataRandom){
            System.out.println(data);
        }
    }
}
