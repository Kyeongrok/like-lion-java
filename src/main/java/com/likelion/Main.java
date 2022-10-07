package com.likelion;

import com.likelion.context.PopulationMoveParser;
import com.likelion.context.ReadLineContext;
import week3.day4.PopulationMove;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadLineContext<PopulationMove> readLineContext =
                new ReadLineContext<>(new PopulationMoveParser());
        List<PopulationMove> result = readLineContext.readByLine("");
    }
}
