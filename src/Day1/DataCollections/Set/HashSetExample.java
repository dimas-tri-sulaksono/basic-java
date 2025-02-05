package Day1.DataCollections.Set;

/* HashSet : implementasi dari interface set buat nyimpen data-data yang unik (tidak boleh duplikat)
*  dalam bentuk himpunan atau set */

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> himpunanNama = new HashSet<>();

        himpunanNama.add("dimas");
        himpunanNama.add("sulaksono");
        himpunanNama.add("dimas");

        System.out.println("set nama : "+ himpunanNama);

    }
}
