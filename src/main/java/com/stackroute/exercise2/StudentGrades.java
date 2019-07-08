package com.stackroute.exercise2;

public class StudentGrades {
    public float[] average(int n,int[] array) {
        int sum = 0;
        float avg;
        float[] result=new float[3];
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < n; i++) {
            if (min > array[i]) {                     //condition for finding minimum value
                min = array[i];
            }
            if (max < array[i]) {                     //condition to find maximum value
                max = array[i];
            }
            sum = sum + array[i];                     //adding all the elements in an array
        }
        avg = sum / n;                                //calculating average using sum
        result[0]=avg;
        result[1]=min;
        result[2]=max;
        return result;
    }
}
