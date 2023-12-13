package application.chapter1.sesi4;

import java.io.*;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        String fileName = "puisi.txt";
        String fileContent = "Belajar membaca dan menulis file di Java!";

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(fileContent);
            fileWriter.close();

            System.out.println("File sudah ditulis ulang!");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("line="+line);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca file " + fileName);
        }
    }
}
