package week3.day3.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BibleParser {

    public String readFilePerAByte(String filename) throws IOException {
        String book = "";

        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                1026*1024  // 1mb
        );

        int i;
        int cnt = 0;

        while ((i = br.read()) != -1) {
//            book += (char) i;
            cnt += 1;
//            System.out.println((char)i);
//            book += i;
        }
        System.out.println(cnt);
        return book;
    }

    public String readFileByLine(String filename) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        return line;
    }



    public static void main(String[] args) throws IOException {
        BibleParser bp = new BibleParser();
        String book = bp.readFilePerAByte("gaeLines.json");
//        String book = bp.readFileByLine("gaeLines.json");
        System.out.println(book);

    }
}
