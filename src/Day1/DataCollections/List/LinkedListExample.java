package Day1.DataCollections.List;

import java.util.LinkedList;

/* Linked list : implementasi dari interface list yang punya fungsi sama kayak array list */

public class LinkedListExample {
    public static void main(String[] args){
        // linked list
        LinkedList<String> daftarNama = new LinkedList<>();

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
    }
}
