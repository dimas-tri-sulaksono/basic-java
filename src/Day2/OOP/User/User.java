package Day2.OOP.User;

/* inheritance
*  konsep untuk menurunkan sifat/prilaku parent class ke child class
*  artinya class turunan bisa menggunakan properti dan method milik parent
*  child class (inheritance) ditandai dengan kata kunci 'extends' */

public class User {
    private  String username;

    public User(String uname){ username = uname; }

    public String getUsername(){ return username; }
    public void displayInfo(){
        System.out.println("username : "+ username);
    }
}
