package Day3.Equals;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<User> listUser = new ArrayList<>();

    public void registerUser(User user){
        listUser.add(user);
    }

    public void isUserRegistered(User user){
        if(listUser.contains(user)){
            System.out.println(user.getUsername() +" is registered");
        } else {
            System.out.println(user.getData() +" is not registered");
        }
    }

    public static void main(String[] args) {
        Main userController = new Main(); // instance dari object Main

        User user1 = new User("dimas", "dimas@mail.com");
        User user2 = new User("sulaksono", "sulaksono@mail.com");

        userController.registerUser(user1);
        userController.registerUser(user2);

        User userNotRegistered = new User("tri", "tri@mail.com");
        userController.isUserRegistered(userNotRegistered);
        userController.isUserRegistered(user1);

    }
}
