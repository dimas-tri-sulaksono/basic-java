package Day2.Downcasting;

/* Downcasting : mengubah superclass/parent menjadi subclass/child class
*  biar bisa make method/atribut yang spesifik dari subclass */

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin(); // bikin object admin
        Guest guest = new Guest();
        User user1 = admin; // bikin object user
        User user2 = guest;

        Admin admin1 = (Admin) user1; // downcasting user ke admin
        admin1.adminStatus(); // method yang ingin dipakai superclass
        admin1.login(); // method yang masih bisa dipakai superclass walaupun udah di downcast
    }
}
