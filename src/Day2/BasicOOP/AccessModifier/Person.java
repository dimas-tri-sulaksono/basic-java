package Day2.BasicOOP.AccessModifier;

public class Person {
    // Access modiifier : kata kunci untuk mengatur aksebilitas, visibilitas dari sebuah class, variable atau method

    // public
    public String name; // bisa diakses di mana aja

    // private
    private int age; // cuma bisa diakses di dalam kelas itu sendiri (person)

    //protected
    protected String address; // cuma bisa diakses oleh class sendiri (person) dan subclass-nya

    // Non-access modifier :
    // static
    public static int totalPerson = 0; // variable statis untuk ngasih nilai awal terhadap variable

    // final
    public final String NATIONALITY = "Indonesian"; // untuk bikin nilai constant

    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;

        totalPerson++;
    }

    //method
    public void displayInfo(){
        System.out.println("My name : "+name);
        System.out.println("My age : "+age);
        System.out.println("My address : "+address);
    }

    //method static untuk nampilin total object setiap kali object persno bertambah
    public  static void displayTotalPerson(){
        System.out.println("Total Person : "+ totalPerson);
    }
}
