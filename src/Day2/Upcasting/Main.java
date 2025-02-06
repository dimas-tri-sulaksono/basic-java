package Day2.Upcasting;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        User user1 = admin; // upcasting admin ke user

        user1.login(); // menggil method dari supperclass
        // user1.adminStatus(); // error karena efek upcasting


    }
}
