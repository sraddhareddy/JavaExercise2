package com.stackroute.exercise2;

public class PowerOf4 {

    public String checkInput(int input){

        if(input == 0) {                           //base condition
            return "not power of four";
        }
        else if(input>1) {
            while (input != 1) {
                if (input % 4 == 0) {
                    input = input / 4;
                } else {
                    return "not power of four";
                }
            }
            return "power of four";
        }
        else{
            while (input != -1) {
                if (input % 4 == 0) {
                    input = input / 4;
                } else {
                    return "not power of four";
                }
            }
            return "power of four";
        }
        }
    }

