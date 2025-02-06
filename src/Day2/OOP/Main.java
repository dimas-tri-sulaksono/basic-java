package Day2.OOP;

import Day2.OOP.Blog.Blog;
import Day2.OOP.Student.Student;
import Day2.OOP.User.Admin;
import Day2.OOP.User.User;

public class Main {
    public static void main(String[] args) {
        // class biasa
        System.out.println("=== GET STUDENT ===");
        Student s1 = new Student("imron", 70);
        s1.cekStatus();

        Student s2 = new Student("tri", 90);
        s2.name = "Dimas";
        s2.score = 95;
        s2.cekStatus();


        // class enkasulasi
        System.out.println("\n=== GET STUDENT ===");
        Blog myBlog = new Blog("Bootcamp Aigen Batch 3", "Open Registration");
        myBlog.displayInfo();
        myBlog.getTitle(); // buat nampilin title
        myBlog.setTitle("bootcamp aigen batch 2");
        myBlog.setContent("pendaftaran ditutup");
        myBlog.displayInfo();

        // comment
        myBlog.addComment("Alwi", "masih buka ngga gan?");
        myBlog.addComment("Imron", "bayar ngga gan?");
        myBlog.displayComments();

        System.out.println("=== GET USERS ===");
        User userGuest = new User("imron");
        userGuest.displayInfo();

        Admin userAdmin = new Admin("Alwi", true);
        userAdmin.displayInfo();
    }
}
