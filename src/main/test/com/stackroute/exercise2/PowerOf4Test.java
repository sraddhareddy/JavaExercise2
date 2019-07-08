package com.stackroute.exercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOf4Test {
        PowerOf4 testobj;

        @Before
        public void setUp() {
            testobj = new PowerOf4();
        }

        @After
        public void tearDown() {
            testobj = null;
        }

        @Test
        //arrange
        public void givenIntegerShouldReturnmessage() {
            //act
            String res = testobj.checkInput(16);
            //assert
            assertEquals("power of four", res);
        }

        @Test
        public void givenNegativeIntegerReturnmessage() {
            String res = testobj.checkInput(-16);
            assertEquals("power of four", res);
        }

        @Test
        public void givenZeroShouldReturnmessage() {
            String res = testobj.checkInput(0);
            assertEquals("not power of four", res);
        }

    }