package Day2.BasicOOP.AccessModifier;

public class Main {
    public static void main(String[] args) {
        // panggil class dalam object baru
        Person person1 = new Person("Dimas", 30, "Depok");
        Person person2 = new Person("Ma'ruf", 30, "Jakut");
        Person person3 = new Person("Alwi", 30, "Tangsel");

        // panggil methodnya
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        Person.displayTotalPerson();

        // akses datanya
        System.out.println("public access : "+ person1.name);
        //System.out.println("private access : "+ person1.age);
        System.out.println("protected access : "+ person1.address);
        System.out.println("final access : "+ person1.NATIONALITY);

        /* kapan harus implementasi?
        *  public : biasanya dipake untuk class atau method-method yang biasanya bisa dipanggil
        *  private : biasanya dipake utnuk mendeklarasikan variable class di mana ngga bisa sembarangan diubah
        *  final : ketika kita mau definisiin nilai default yang constant untuk suatu variable */


    }
}
