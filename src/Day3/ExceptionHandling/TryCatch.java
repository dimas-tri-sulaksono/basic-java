package Day3.ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};

        try {
            //
            int checkNumber = numbers[3];
            System.out.println("Nilai yang diakses : "+ checkNumber);
        } catch (ArrayIndexOutOfBoundsException e){
            //
            System.out.println("index array tidak valid");
            System.out.println("");
        }

    }
}
