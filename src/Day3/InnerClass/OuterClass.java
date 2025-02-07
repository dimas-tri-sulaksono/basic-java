package Day3.InnerClass;

/* Inner class : class dalam class, inner class bisa akses atribut dan method milik outer class
*  implementasi innerclass bisa dipake ketika kita mau bikin struktur data object dalam object */

public class OuterClass {
    private String outerVar = "10";

    public class InnerClass{
        public void display(){
            System.out.println("outer var : "+ outerVar );
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}

/* Visual
*  const outer = {
*       outerVar = 10;
*       innerClass = {
*           inner = outerVar;
*       }
*  } */