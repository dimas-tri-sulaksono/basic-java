package Day1.DataCollections.Map;

import java.util.HashMap;

/* hash map : oimplementasi dari interface Map, buat nyimpen data object dalam bentuk key-value
*  hashmap kayak representasi object kalau di javascript */
public class HashMapExample {
    public static void main(String[] args) {
        // hashMap
        HashMap<String, String> daftarNama = new HashMap<>();

        // nambahin data ke hashMap
        daftarNama.put("name","dimas");
        daftarNama.put("umur","26");
        daftarNama.put("job","fullstack");

        System.out.println("name : "+ daftarNama.get("name"));
        System.out.println("umur : "+ daftarNama.get("umur"));
        System.out.println("job : "+ daftarNama.get("job"));

        // ngecek ukuran data
        System.out.println("Ukuran HashMap : "+ daftarNama.size());

        // ngecek ngecek hashmap kosong
        System.out.println("Apakah HashMap Kosong? "+ daftarNama.isEmpty());

        // nampilin semua key di dalam hasMap
        for (String key : daftarNama.keySet()){
            System.out.println("Key HashMap : "+ key);
        }

        // nampilin semua isi data di dalam hasMap
        for (String value : daftarNama.values()){
            System.out.println("Data : "+ value);
        }

        // nampilin semua key dan data di  hasMap
        for (String key : daftarNama.keySet()){
            System.out.println("Semua Data : "+daftarNama.get(key));
        }

        // ngecek ukuran data
        daftarNama.put("name", "Dimaz");
        System.out.println("  "+ daftarNama.size());
    }
}
