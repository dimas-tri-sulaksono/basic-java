package Day2.AnnonymousClass;

/* anonymous class : class sementara yang mewarisi class parentnya
*  ini cara singkat / sekali pakai buat ngasih fungsi tambahan pada class dan interface yang udah ada daripada bikin class baru tang terpisah */

public class Main {
    public static void main(String[] args) {
        User user= new User("dimas", 20);

        UserInterface userAction = new UserInterface() {
            @Override
            public void displayUser() {
                System.out.println("user name : "+ user.getName());
                System.out.println("user age : "+ user.getAge());
            }
            @Override
            public void updateUser(){
                System.out.println("user updated!");
            }
        };

        userAction.displayUser();
        userAction.updateUser();
    }
}
