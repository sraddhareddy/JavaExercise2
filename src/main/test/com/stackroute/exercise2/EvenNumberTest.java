package com.stackroute.exercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberTest {
    EvenNumber testobj;

    @Before
    public void setUp() {
        testobj = new EvenNumber();
    }

    @After
    public void tearDown() {
        testobj = null;
    }

    @Test
    public void testGivenIntReturnTrue() {        //arrange
        boolean res = testobj.isEven(10);   //act               //giving even number as input
        assertEquals(true, res);         //assert
    }

    @Test
    public void testGivenIntReturnFalse() {
        boolean res = testobj.isEven(5);                      //giving odd number as input
        assertEquals(false, res);
    }

    @Test
    public void testGivenNegativeIntReturnFalse() {
        boolean res = testobj.isEven(-10);                    //neagitive value as input
        assertEquals(true, res);
    }

    @Test
    public void testGivenZeroReturnResult() {
        boolean res = testobj.isEven(0);                     //zero as input
        assertEquals(true,res);

    }
}