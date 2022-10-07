package week3.day4;

import com.likelion.parser.PopulationMoveParser;
import com.likelion.context.ReadLineContext;
import com.likelion.domain.PopulationMove;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadLineContext<PopulationMove> readLineContext =
                new ReadLineContext<>(new PopulationMoveParser());
        List<PopulationMove> result = readLineContext.readByLine("");
    }
}
