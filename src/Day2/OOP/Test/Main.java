package Day2.OOP.Test;

/* 1. Buat object / class Student dengan atribut name, NIM, dan nilai
*     lalu simpan data Student tersebut ke dalam ArrayList
*     kemudian buat method berikut:
*       a. menghitung nilai rata-rata student
*       b. cari nilai tertinggi
*       c. dan tampilkan data student dengan nilai di atas rata-rata  */

public class Main {
    public static void main(String[] args) {
        Student dtStudent = new Student(0,"nama",10);
        dtStudent.addStudent(1,"dimas",90);
        dtStudent.addStudent(2,"tri",95);
        dtStudent.addStudent(3,"sulaksono",100);

        // menampilkan data siswa
        // dtStudent.displayData();

        // nilai rata-rata
        // siswa dengan nilai di atas rata-rata
        dtStudent.countAvg();

        // nilai tertinggi
        // dtStudent.maxScore();
    }
}
