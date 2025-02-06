package Day2.BasicOOP;

import Day2.BasicOOP.Basic.Human;

public class Main {
    public static void main(String[] args) {
        // Instance creation dari class human : proses bikin objek baru dari sebuah class
        Human student = new Human("Imron", 30);

        // instance method: method yang bisa diakses oleh object yang menampung suatu class
        student.breath();
        student.fart();
    }
}
