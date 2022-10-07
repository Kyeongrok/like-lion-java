package com.likelion.parser;

import com.likelion.context.Parser;
import com.likelion.domain.PopulationMove;

public class PopulationMoveParser implements Parser<PopulationMove> {
    @Override
    public PopulationMove parse(String str) {
        String[] splittedLine = str.split(",");
        return new PopulationMove(splittedLine[6], splittedLine[0]);// 전입to 전출from
    }
}
