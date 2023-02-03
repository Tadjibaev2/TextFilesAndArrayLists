package files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("files/letters.txt");
        for (int i = 0; i < 10; i++) {
            fileWriter.write(Integer.toString(i));
        }
        fileWriter.write("\n");
        for (int i = 65; i <= 90; i++) {
            fileWriter.write(i);
        }
        fileWriter.close();
        FileReader fileReader = new FileReader("files/letters.txt");
        Scanner scanner = new Scanner(fileReader);
        int i = 1;
        while (scanner.hasNextLine()){
            System.out.println(i + ": " + scanner.nextLine());
            i++;
        }
        fileReader.close();
    }
}