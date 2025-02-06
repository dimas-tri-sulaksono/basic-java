package Day2.OOP.Student;

public class Student {
    public String name;
    public int score;
    private Boolean isPass;

    public Student(String studentName, int studentScore){
        name = studentName;
        score = studentScore;
        isPass = false;
    }

    public void cekStatus(){
        if(score >= 85){
            isPass = true;
            System.out.println("name : "+ name +", score : "+ score +", isPass "+ isPass);
            System.out.println("status : Lulus!");

        } else {
            System.out.println("name : "+ name +", score : "+ score +", isPass "+ isPass);
            System.out.println("status : Tidak Lulus!");
        }
    }
}
