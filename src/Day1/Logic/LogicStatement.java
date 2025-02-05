package Day1.Logic;

public class LogicStatement {
    public static void main(String[] args) {
        int nilai = 10;

        // if
        System.out.println("=== IF ===");
        if (nilai == 10) {
            System.out.println("nilaimu bagus");
        }

        // if - else
        System.out.println("=== IF ELSE ===");
        int nilaiSiswa = 75;
        if (nilaiSiswa >= 60){
            System.out.println("Lulus");
        } else {
            System.out.println("Drop out");
        }

        // if-else-if
        System.out.println("=== IF ELSE IF ===");
        if (nilaiSiswa >= 90){
            System.out.println("nilai A");
        } else if (nilaiSiswa >= 80){
            System.out.println("nilai B");
        } else {
            System.out.println("nilai C");
        }

        // switch case
        System.out.println("=== Switch Case ===");
        char grade = 'B';
        switch (grade){
            case 'A':
                System.out.println("Sangat Baik");
                break;
            case 'B':
                System.out.println("Baik");
                break;
            default:
                System.out.println("Nilai tidak valid");
                break;
        }
    }
}
