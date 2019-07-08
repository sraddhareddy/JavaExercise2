package com.stackroute.exercise2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome testobj;

    @Before
    public void setUp() throws Exception {
        testobj=new Palindrome();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        testobj=null;
    }
    @Test
    //arrange
    public void givenNumberShouldReturnMessage(){
        //act
        String reverse=testobj.reverseinput(121);         //palindrome number
        //assert
        assertEquals("palindrome",reverse);
    }
    @Test
    //arrange
    public void givenIntShouldReturnStringMessage(){
        //act
        String reverse=testobj.reverseinput(120);         //not a palindrome number
        //assert
        assertEquals("not a palindrome",reverse);
    }
    @Test
    //arrange
    public void givenIntShouldReturnMessage(){
        //act
        String reverse=testobj.reverseinput(-121);         //neagitive palindrome number
        //assert
        assertEquals("palindrome",reverse);
    }

}