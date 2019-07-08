package com.stackroute.exercise2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial obj;
    @Before
    public void setUp(){
        obj=new Factorial();
    }
    public void tearDown(){
        obj=null;
    }
@Test
//arrange
    public void testFactorialCheck(){
       //act
    long result=obj.factorial(20);                 //factorial of 20 is the maximum value long can hold
        //assert
        assertEquals(2432902008176640000L,result);
    }
    @Test
    public void testFactorialShouldReturn1() {
        long result = obj.factorial(0);        //factorial of 0 is 1
        assertEquals(1L, result);
    }

    @Test
    public void testNeagitiveValueFactorialShouldReturnValue() {
        long result = obj.factorial(-5);       //factorial of neagitive value depends on the number
        assertEquals(-120L, result);          //if number is odd factorial is neagitive else positive
    }
}