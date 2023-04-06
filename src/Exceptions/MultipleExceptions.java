package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.management.MonitorInfo;
import java.text.ParseException;

public class MultipleExceptions {
    public void start() throws IOException,ParseException{
        //throw new IOException();

        throw new ParseException("Error at line 10", 2);
    }

    public void example() throws IOException, FileNotFoundException{}
    public static void main(String[] args) throws IOException, ParseException {

        MultipleExceptions me = new MultipleExceptions();

        try {
            me.start();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
            System.out.println("Incorrect Format");
        }

        try {
            me.example();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
