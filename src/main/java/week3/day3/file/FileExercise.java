package week3.day3.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise {
    private String filename;

    public FileExercise(String filename) {
        this.filename = filename;
    }

    public String readNChars(int N) throws IOException {
        FileReader fileReader = new FileReader(this.filename);
        String str = "";
        for (int i = 0; i < N; i++) {
            // -가 나올 경우 break
            int asciiCd = fileReader.read();
            if (asciiCd == -1) {
                return str;
            }
            str += (char) asciiCd;
        }
        return str;
    }
    public static void main(String[] args) throws IOException {
        // ./
        FileExercise fileExercise = new FileExercise("aa_file.txt");
        String str = fileExercise.readNChars(10);
        System.out.println(str);
    }
}
