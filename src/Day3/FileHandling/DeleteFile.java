package Day3.FileHandling;

import java.io.*;

public class DeleteFile {
    public static void main(String[] args) {
        String fileName = "C:\\_aigen\\_mainClass\\backend\\basic_java\\src\\Day3\\FileHandling\\test.txt";
        File file = new File(fileName);

        if(file.exists()){
            if(file.delete()){
                System.out.println("file berhasil dihapus");
            }
        } else{
            System.out.println("file tidak ditemukan!");
        }
    }
}
