package com.stackroute.exercise2;

import java.io.*;

public class FrequencyOfWords {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/sraddha/Desktop/hello"); // path of folder
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        String line;
        int countWord = 0;
        while ((line = reader.readLine()) != null) {
            if (!(line.equals(""))) {
                String[] wordList = line.split("\\s+");        //counting number of words
                countWord += wordList.length;
            }
        }
        System.out.println(countWord);
    }
}
