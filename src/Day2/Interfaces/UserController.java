package Day2.Interfaces;

import java.util.HashSet;

// cara manggil interface di UserController
public class UserController implements User, Role {
   private String username;
   private String password;
   private HashSet<String> user = new HashSet<>();

   public UserController(String username, String password){
       this.username = username;
       this.password = password;
   }

    @Override
    public  String getUsername(){return username;}

    @Override
    public  String getPassword(){return password;}

    @Override
    public void addUser(String username, String password){
        user.add(username);
        user.add(password);
        System.out.println(username + " dan "+ password +" telah berhasil ditambahkan");
    }

    @Override
    public int getAllUser(){return user.size();}
}
