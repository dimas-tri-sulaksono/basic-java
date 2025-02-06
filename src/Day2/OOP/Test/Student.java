package Day2.OOP.Test;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private int score;
    private List<Student> students;

    public Student(int studentId, String studentName, int studentScore){
        id = studentId;
        name = studentName;
        score = studentScore;

        students = new ArrayList<>();
    }

    public int nilaiTotal, nilaiAvg = 0;
    public void countAvg(){
        for(Student student : students){
            nilaiTotal = nilaiTotal + student.score;
        }
        nilaiAvg = nilaiTotal/students.size();
        System.out.println("\nnilai rata-rata : "+ nilaiAvg);

        System.out.println("\nsiswa dengan nilai di atas rata-rata: ");
        for (Student student: students){
            if (student.score >= nilaiAvg){
                System.out.println("nama : "+ student.name +", nilai: "+student.score);
            }
        }
    };

    int max = 0;
    public void maxScore(){
        for (Student student : students){
            max = Math.max(max,student.score);
        }
        System.out.println("\nnilai tertinggi : "+ max);
    }

    // gatter & setter
    public Integer getId(){return id;}
    public String getName(){return name;}
    public Integer getScore(){return score;}

    // untuk menyimpan data student ke arraylist
    public void addStudent(int id, String name, int score){
        Student newStudent = new Student(id, name, score);
        students.add(newStudent);
    }

    // menampilkan data student
    public void displayData(){
        System.out.println("Data Siswa :");
        for(Student student : students){
            System.out.println("NIM : "+ student.getId());
            System.out.println("Nama : "+ student.getName());
            System.out.println("Nilai : "+ student.getScore());
        }
    }
}
