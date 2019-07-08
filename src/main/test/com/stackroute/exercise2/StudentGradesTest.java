package com.stackroute.exercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradesTest {
    StudentGrades testobj;
    @Before
    public void setUp(){
        testobj=new StudentGrades();
    }
    @After
    public void  tearDown(){
        testobj=null;
    }
    @Test
    //arrange
    public void givenIntArrayShouldReturn(){
        //act
        float[] res=testobj.average(4,new int[]{86,87,88,89});  //all numbers are positive
        //assert
        assertArrayEquals(new float[]{87.5234f,86,89},res,2);
           }
    @Test
    public void givenIntArrayShouldCalculateMathFunctions(){
        float[] res=testobj.average(4,new int[]{87,-87,-88,88});    //avg is 0
        assertArrayEquals(new float[]{0,-88,88},res,2);
    }
    @Test
    public void givenZerosShouldCalculateMathFunctions(){
        float[] res=testobj.average(4,new int[]{0,0,0,0});   //all numbers are 0
        assertArrayEquals(new float[]{0,0,0},res,2);
    }

}