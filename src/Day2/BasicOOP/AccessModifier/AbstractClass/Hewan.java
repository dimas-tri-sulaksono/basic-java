package Day2.BasicOOP.AccessModifier.AbstractClass;

/* abstract class : class yang gak bisa dibuat instance creation secara langsung atau gak bisa dibuat secara langsung, cuma bisa dipake buat class, subclass dan turunannya */

public abstract class Hewan {
    public String nama;
    public  int umur;

    public Hewan(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    /* abstract method : method yang harus diimplementasikan oleh class turunannya, kalau ngga diimplementasi, maka class turunan juga jadi abstract dan gak bisa dibuat object secara langsung */
    public abstract void makan();

    // method biasa
    public void tidur(){
        System.out.println(nama +" lagi turu!");
    }

    // getter/setter (getter: buat ambil data / setter: buat ngeset data)
    public String getNama(){
        return nama;
    }

    public int getUmur(){
        return umur;
    }
}
