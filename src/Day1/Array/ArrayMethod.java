package Day1.Array;

import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {
        System.out.println("=== Array Biasa ===");
        int[] numbers ={1,2,3,4,5};

        System.out.println("");
        numbers[4] = 7;

        System.out.println("=== Array Method ===");
        System.out.println("=== Sort ===");
        Integer sortArray[] = {2,4,7,3,5,6,1};
        // method untuk sorting data ASC
        Arrays.sort(sortArray);
        for (int i : sortArray) {
            System.out.println("sorted array = " + i);
        }

        System.out.println("=== Fill ===");
        // method fill : method untuk mengisi semua index array dengan nilai yang sama
        int[] fillNumbers = new int[5];
        Arrays.fill(fillNumbers, 7); // buat ngisi semua data jadi 7
        for (int i : fillNumbers) {
            System.out.println("fill : "+ i);
        }

        System.out.println("=== Copy of Array  ===");
        // method untuk nyalin array lain
        int[] copyNumber = Arrays.copyOf(numbers, numbers.length);
        for (int i : copyNumber){
            System.out.println("copy numbers : "+ i);
        }

        // nyalin data dari array numbers ke array newNumbers dan nambahin panjang datanya 1
        int[] newNumbers = Arrays.copyOf(numbers, numbers.length + 1);
        newNumbers[5] = 50;
        for (int i :  newNumbers){
            System.out.println("copy newNumbers : "+ i);
        }

        // equals array : untuk membandingkan 2 data array (sama atau tidak sama)
        System.out.println("=== Equals Array ===");
        int[] equalNumbers1 = {1,2,3,4,5};
        int[] equalNumbers2 = {1,2,3,4,5};
        boolean isEqual = Arrays.equals(equalNumbers1,equalNumbers2);
        System.out.println("is equal : "+ isEqual);

        int search = 4;
        for (int i : equalNumbers1){
            if(equalNumbers1[i] == search){
                System.out.println("value "+search+" is exist");
                System.out.println("current value : "+ equalNumbers1[i] );
                break; // buat stoping proses looping ketika kondisi terpenuhi
            }
        }


        System.out.println("=== Convert to String ===");
        String arrayToString = Arrays.toString(newNumbers);
        System.out.println("array to string "+ arrayToString);

        System.out.println("===  ===");
    }
}
