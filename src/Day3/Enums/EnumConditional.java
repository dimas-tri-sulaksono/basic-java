package Day3.Enums;

public class EnumConditional {
    enum userStatus{
        ACTIVE, NONACTIVE, BANNED
    }

    static class User{
        private String nama;
        private userStatus status;

        public User(String nama, userStatus status){
            this.nama = nama;
            this.status = status;
        }

        public void setStatus(userStatus status){
            this.status = status;
        }

        public void checkStatus(){
            System.out.println("User "+ nama +" is "+ status);
        }

        public static void main(String[] args) {
            userStatus user1 = userStatus.ACTIVE;

            if (user1 == userStatus.ACTIVE) {
                System.out.println("User is Active");
            } else  {
                System.out.println("User is non-active");
            }

            User dimas = new User("dimas", userStatus.ACTIVE);
            System.out.println("==== cek status ===");
            dimas.checkStatus();

            System.out.println("==== update status ===");
            dimas.setStatus(userStatus.BANNED);
            dimas.checkStatus();


        }
    }
}
