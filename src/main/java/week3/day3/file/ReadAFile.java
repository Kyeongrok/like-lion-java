package week3.day3.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {

    public void printDirFiles(String filepath) {
        File dir = new File("./");
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }

    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("./a_file.txt");
        char c = (char) reader.read();
        System.out.println(c);

    }
}
