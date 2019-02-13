package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C1Test {

    @Test
    void nMax() {

        double arg[] = {1, 5, 8, 5, 8, 8, 3};
        int expectedResult = 3;
        try {
            assertEquals(expectedResult, C1.nMax(arg) );
        }catch (EmptyArgException eae){
            eae.printStackTrace();
            fail("nMax : EmptyArgException non attendu.");
        }

    }

    @Test
    void nMaxWithNegatives() {

        double arg[] = {-100, -5, -8, -5, -18, -8, -30};
        int expectedResult = 2;
        try {
            assertEquals(expectedResult, C1.nMax(arg) );
        }catch (EmptyArgException eae){
            eae.printStackTrace();
            fail("WithNegatives : EmptyArgException non attendu.");
        }

    }

    @Test
    void nMaxWithDouble() {

        double arg[] = {1, 5, 8.5, 5, 8, 8, 3};
        int expectedResult = 1;
        try {
            assertEquals(expectedResult, C1.nMax(arg) );
        }catch (EmptyArgException eae){
            eae.printStackTrace();
            fail("NullArray : EmptyArgException non attendu.");
        }

    }


    @Test
    void emptyArray() {

        double arg[] = {};
        int expectedResult = 0; //valeur bidon, on attend une exception
        try {
            assertEquals(expectedResult, C1.nMax(arg));
            fail();
        }catch (EmptyArgException eae){
            eae.printStackTrace();
            assertTrue(true);
        }

    }

    @Test
    void nullArray() {

        double arg[] = null;
        int expectedResult = 0; //valeur bidon, on attend une exception
        try {
            assertEquals(expectedResult, C1.nMax(arg) );
        }catch (EmptyArgException eae){
            eae.printStackTrace();
            fail("NullArray : EmptyArgException non attendu.");
        }catch (IllegalArgumentException iae){
            iae.printStackTrace();
            assertTrue(true);
        }

    }

}