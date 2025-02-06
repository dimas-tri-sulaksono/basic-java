package Day2.BasicOOP;

/* BASIC OOP
*  class : konsep dasar untuk bikin object atau kerangka kerja yang mendefinisikan karakteristik dan prilaku suatu object atau bisa dibilang class yang berisi fungsionallitas suatu program */

public class Basic { // class penampung
    public static class Human{  // class static yang bisa dipanggil oleh kelasa lainnya
        // class atribute, data yang dimiliki oleh object
        String name;
        int age;

        // constructor : method khusus yang menginisialisaikan object/mengatur nilai awal dari variable class
        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }

        // method : fungsi khusus yang dimiliki oleh object
        public void breath(){
            System.out.println(name +" is breathing. and he's age "+ age +" years old");
        }

        public  void fart(){
            System.out.println(name +" is farting");
        }
    }
}
