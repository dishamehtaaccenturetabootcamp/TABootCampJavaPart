package com.bootcampexcercise.module7.sample;
// Needs to be completed

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionSample {

    public static void main(String arg[]) {

        String fileName = "M0 - Setting up Envrionment.pptx";
//        String fileName = "Presentations/M0 - Setting up Envrionment.pptx";

        //The following class is used to open a file for reading
        FileReader reader;
        try {
            //The following line must be written in a try catch block
            //else it would not compile since
            //FilenotFoundException is a checked exception.
            //1 - Instantiate reader and pass fileName as a parameter
            reader = new FileReader(fileName);
            System.out.println("Try part executed as we have correct file path");
            //2 - catch FileNotFoundException
        } catch (FileNotFoundException f){
            System.out.println("Please give correct path of file");
        }

    }
}
