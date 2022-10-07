package com.likelion;

import com.likelion.domain.Patient;
import com.likelion.parser.PatientParser;
import com.likelion.parser.PopulationMoveParser;
import com.likelion.context.ReadLineContext;
import com.likelion.domain.PopulationMove;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadLineContext<Patient> patientReadLineContext = new ReadLineContext<>(new PatientParser());
        List<Patient> patients = patientReadLineContext.readByLine("./8842height.phe.txt");
        for (Patient patient : patients) {
            System.out.println(patient.getHeight());
        }

    }
}
