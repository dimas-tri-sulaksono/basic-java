package Day2.BasicOOP.AccessModifier.AbstractClass;

public class Main {
    public static void main(String[] args) {
        // bikin object dari turunan kelas hewan
        Kucing kucingOyen = new Kucing("nguyen", 2);

        // akses method
        kucingOyen.makan();
        kucingOyen.tidur();

        // akses getter
        System.out.println("name kucing : "+ kucingOyen.getNama());
        System.out.println("umur kucing : "+ kucingOyen.getUmur());
    }
}
