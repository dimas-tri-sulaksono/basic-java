package Day2.Downcasting;

// ini class parent
public class User {
    void login(){
        System.out.println("login success!");
    }
}

// subclass
class Admin extends User{
    // <T> : untuk mengembalikan nilai dengan tipe data apapun???
    // void : method yang ngga punya return
    void adminStatus(){
        System.out.println("Hi, Admin");
    }
}

// subclass
class Guest extends User{
    void adminStatus(){
        System.out.println("Hi, Guest");
    }
}