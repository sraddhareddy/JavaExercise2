package com.stackroute.exercise2;

import java.io.File;
import java.io.FilenameFilter;

public class FilesFolder {

    public static void main(String a[]) {
        File file = new File("/home/sraddha/Documents/Example");   //path of folder in which files need to be extracted
        File[] files = file.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".md")) {        //specific extension
                    return true;
                } else {
                    return false;
                }
            }
        });
        for (File f : files) {
            System.out.println(f.getName());             //all files with given extension
        }
    }
}
