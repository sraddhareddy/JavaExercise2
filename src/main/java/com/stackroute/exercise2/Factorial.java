package com.stackroute.exercise2;

public class Factorial {
public long factorial(int number){
    long fact=1;
    if(number>0) {
        for (int i = 1; i <= number; i++) {     //iterate from 1 to number to multiply each number to "fact"
            fact = fact * i;
        }
    }
    else{                                      //calculating factorial for neagitive numbers
        for(int i=-1;i>=number;i--){
            fact=fact*i;
        }
    }
    return fact;
}
}

