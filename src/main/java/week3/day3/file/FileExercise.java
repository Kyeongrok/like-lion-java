package week3.day3.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExercise {
    public static void main(String[] args) throws FileNotFoundException {
        // ./
        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }
    /*
    .\.git
    .\.gradle
    .\.idea
    .\.settings
    .\8842height.phe.txt
    .\aa_file.txt
    .\afile.txt
    .\a_file.txt
    .\build
    .\build.gradle
    .\gaeLines.json
    .\gradle
    .\gradlew
    .\gradlew.bat
    .\out
    .\README.md
    .\settings.gradle
    .\src
    .\ten_million_numbers.txt
    .\test.txt
         */
}
