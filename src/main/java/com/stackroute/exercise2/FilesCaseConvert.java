package com.stackroute.exercise2;

import java.io.FileReader;
import java.rmi.server.ExportException;

public class FilesCaseConvert {
    public static void main(String[] args) throws Exception {
        FileReader frr=new FileReader("/home/sraddha/Desktop/hello");   //opening the text file
        int i;
        int count=0;
        while((i=frr.read())!=-1){                 //loop through all the characters
            count++;                               //count number of characters
            System.out.print((Character.toUpperCase((char)i)));
        }
        System.out.println(count);
    }
}
