package Day3.FileHandling;

import java.io.*;

public class EditFile {
    public static void main(String[] args) {
        String fileName = "C:\\_aigen\\_mainClass\\backend\\basic_java\\src\\Day3\\FileHandling\\test.txt";
        File file = new File(fileName);

        // buat konten baru setelah pengeditan
        StringBuilder newContent = new StringBuilder();

        //cek filenya ada kaga
        if (file.exists()){
            // baca dulu filenya
            try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
                for (String line; (line = reader.readLine()) != null;){
                    // replace kata programmer jadi badut
                    line = line.replace("tahu", "tempe");
                    newContent.append(line).append(System.lineSeparator());
                }
            }catch (IOException e){
                e.printStackTrace();
            }

            // tulis konten yang diedit ke file yang sama
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
                writer.write(newContent.toString());
                writer.append("123123123");
                System.out.println("file berhasil diedit "+ file.getAbsolutePath());
            }
            catch (IOException e){
                e.printStackTrace();
            }
        } else{
            System.out.println("file tidak ditemukan!");
        }
    }
}
