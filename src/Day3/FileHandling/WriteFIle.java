package Day3.FileHandling;

import java.io.*;

public class WriteFIle {
    public static void main(String[] args) {
        String fileName = "C:\\_aigen\\_mainClass\\backend\\basic_java\\src\\Day3\\FileHandling\\test.txt";

        File file = new File(fileName);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < 100; i++) {
                writer.write((i+"\n"));
            }

            System.out.println("=========================");
            System.out.println("File berhasil dibuat\n path" + file.getAbsolutePath());
            System.out.println("=========================");
        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
