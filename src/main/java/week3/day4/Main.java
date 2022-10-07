package week3.day4;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadLineContext<PopulationMove> readLineContext =
                new ReadLineContext<>(new PopulationMoveParser());
        List<PopulationMove> result = readLineContext.readByLine("");
    }
}
