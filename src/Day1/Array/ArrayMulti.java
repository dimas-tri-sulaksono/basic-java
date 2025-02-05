package Day1.Array;

public class ArrayMulti {
    public static void main(String[] args) {
        Integer[][][] array3D = {
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                },
                {
                        {10,11,12},
                        {13,14,15},
                        {16,17,18}
                }
        };

        for (int i = 0; i < array3D.length; i++){
            for (int j = 0; j < array3D[i].length; j++){
                for (int k = 0; k < array3D[i].length; k++){
                    System.out.print(array3D[i][j][k] +" ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }
}
