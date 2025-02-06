package Day2.BasicOOP.AccessModifier.AbstractClass;

public class Kucing extends Hewan {
    // super : kata kunci buat pake variable yang dimiliki parent
    public Kucing(String nama, int umur){
        super(nama,umur);
    }

    @Override
    public void makan(){
        System.out.println(nama +" lagi makan wishkas!");
    }
}
