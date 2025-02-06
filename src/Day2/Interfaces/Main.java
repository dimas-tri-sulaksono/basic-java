package Day2.Interfaces;

public class Main {
    public static void main(String[] args) {

        UserController akun1 = new UserController("imron", "123");

        System.out.println("username : "+ akun1.getUsername());
        System.out.println("passwod : "+ akun1.getPassword());
        akun1.addUser("dimas", "1234");

        System.out.println("total users : "+ akun1.getAllUser());

        // memanggil static method tanpa menggunakan class
        User.setName("Dimas Tri Sulaksono");

        // manggil method dari role
        akun1.admin(true);
    }
}
