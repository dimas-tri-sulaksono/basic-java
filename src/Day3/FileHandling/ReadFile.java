package Day3.FileHandling;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        String filePath = "C:\\_aigen\\_mainClass\\backend\\basic_java\\src\\Day3\\FileHandling\\test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            //for(String line2; (line2 = reader.readLine()) != null;){;
             //   System.out.println(line2);
            //}
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
