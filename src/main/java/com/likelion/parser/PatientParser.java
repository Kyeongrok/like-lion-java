package com.likelion.parser;

import com.likelion.context.Parser;
import com.likelion.domain.Patient;
import com.likelion.domain.PopulationMove;

public class PatientParser implements Parser<Patient> {
    @Override
    public Patient parse(String str) {
        // 4885	KNIHGR006101	161.8
        String[] splittedLine = str.split("\t");
        return new Patient(splittedLine[0], splittedLine[1], Float.parseFloat(splittedLine[2]));
    }
}
