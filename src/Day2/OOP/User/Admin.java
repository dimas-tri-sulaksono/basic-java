package Day2.OOP.User;

// ini adalah child class implementasi dari inheritance
// child class admin inherit from parent class user
public class Admin extends User {
    private boolean isAdmin;

    public Admin(String username, boolean role){
        super(username); // memanggil variable milik class parent (User)
        isAdmin = false;
    }

    // overwrite method si parent
    @Override
    public void displayInfo(){
        System.out.println("admin username : "+ getUsername());
        System.out.println("is admin : "+ isAdmin);
    }



}
