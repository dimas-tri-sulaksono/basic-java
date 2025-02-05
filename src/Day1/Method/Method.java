package Day1.Method;

// cara import method instance
import static  Day1.Method.MultipleMethod.*;
import static  Day1.Method.Animal.*;

public class Method {
    /* method : fungsi untuk ngejalanin suatu perintah/prilaku tertentu (FUNGSI) */
    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int cekNilai(int nilai){
        if (nilai >= 80){
            System.out.println("lulus");
        } else {
            System.out.println("gak lulus");
        }
        return nilai;
    }

    public static void main(String[] args) {
        int result = add(5, 2);
        System.out.println("Sum : "+ result);

        // panggil method
        cekNilai(90);

        // panggil multiple dari file lain
        System.out.println("=== method overload ===");
        System.out.println("multiple : "+ multiple(10,2));
        System.out.println("multiple : "+ multiple(10,2,3));
        //System.out.println("multiple double : "+ multiple(2.5,5.0,1.5));

        System.out.println("=== method override ===");
        System.out.println(sound());
        System.out.println(Cat.sound());

        //cara manggil instance method : jadi simpan classnya ke object baru
        System.out.println("=== instance method ===");
        Animal hewan = new Animal();
        System.out.println(hewan.sound());

        Cat kucing = new Cat();
        System.out.println(kucing.sound());


    }

}
