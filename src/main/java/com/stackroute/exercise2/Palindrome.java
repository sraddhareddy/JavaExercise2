package com.stackroute.exercise2;

public class Palindrome {
    public String reverseinput(int input) {
        int mod, sum = 0;
        String res = null;
        int revnum = input;
        if(input>0) {//storing the value of input in temporary variable
            while (input > 0) {
                mod = input % 10;
                sum = sum * 10 + mod;
                input = input / 10;
            }
        }
        else {
            while (input < 0) {
                mod = input % 10;
                sum = sum * 10 + mod;
                input = input / 10;
            }
        }
        if (revnum == sum) {                        //checking if reversed number is equal to original number(palindrome or not)
            res = "palindrome";
        } else {
            res = "not a palindrome";
        }

        return res;
    }
}
