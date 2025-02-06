package Day2.Upcasting;

// ini class parent
public class User {
    void login(){
        System.out.println("login success!");
    }
}

// subclass
class Admin extends Day2.Upcasting.User {
    // <T> : untuk mengembalikan nilai dengan tipe data apapun???
    // void : method yang ngga punya return
    void adminStatus(){
        System.out.println("Hi, Admin");
    }
}

// subclass
class Guest extends Day2.Upcasting.User {
    void adminStatus(){
        System.out.println("Hi, Guest");
    }
}