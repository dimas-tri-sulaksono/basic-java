package Day3.Enums;

/* Enum Test
*  buat class untuk mengelola hak akses user menggunakan role dengan spesifikasi berikut:
*  1. buat enum userAccess dengan nilai: CREATE, EDIT, DELETE, DISPLAY_DASHBOARD, dan USER_MANAGEMENT
*  2. buat enum Role masing-masing role punya akses berikut:
*     - ADMIN   : semua akses
*     - EDITOR  : CREATE, EDIT, DISPLAY_DASHBOARD
*     - GUEST   : DISPLAY_DASHBOARD
*  3. buat class User dengan atribut name dan role
*  4. buat method untuk validasi dan menampilkan apakah user punya hak akses tertentu
*  5. buat main method untuk eksekusinya di dalam satu file ini */

import java.util.EnumSet;

public class Test {
    private enum UserAccess {
       CREATE, EDIT, DELETE, DISPLAY_DASHBOARD, USER_MANAGEMENT
    }

    private enum Role{
        ADMIN(EnumSet.of(UserAccess.CREATE, UserAccess.EDIT, UserAccess.DELETE, UserAccess.DISPLAY_DASHBOARD, UserAccess.USER_MANAGEMENT)),
        EDITOR(EnumSet.of(UserAccess.CREATE, UserAccess.EDIT, UserAccess.DISPLAY_DASHBOARD)),
        GUEST(EnumSet.of(UserAccess.DISPLAY_DASHBOARD));

        private final EnumSet<UserAccess> acc;
        Role(EnumSet<UserAccess> acc){this.acc = acc;}

        //public EnumSet<UserAccess> getRole(){return acc;}
    }

    static class User{
       private final String name;
       private final Role role;

       public User(String name, Role role){
           this.name = name;
           this.role = role;
       }

       public void checkRole(UserAccess acc, String name){
           if (role.acc.contains(acc)){
               System.out.println(name +" memiliki akses untuk "+ acc);
           } else {
               System.out.println(name +" tidak memiliki akses untuk "+ acc);
           }
       }
    }

    public static void main(String[] args) {
        Test.User user1 = new User("Dimas", Role.ADMIN);
        Test.User user2 = new User("Sulaksono", Role.EDITOR);

        user1.checkRole(UserAccess.DELETE,user1.name);
        user2.checkRole(UserAccess.DELETE,user2.name);
    }
}
