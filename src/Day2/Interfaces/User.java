package Day2.Interfaces;

/* Interface : kumpulan method yang herus dipakai oleh class yang mengimplementasikannya */

public interface User {
    // method biasa yang wajib dugunakan oleh class yang mengimplementasikannya
    String getUsername();
    String getPassword();

    void addUser(String username, String password);
    //void removeUser(String username);
    int getAllUser();

    //default method = method ini gak perlu di-override (opsional)
    default  void getCompany(){
        System.out.println("company : PT Aigen Global Technology");
    }

    static void setName(String name){
        System.out.println("nama : "+ name);
    }
}
