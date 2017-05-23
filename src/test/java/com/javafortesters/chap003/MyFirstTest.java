/**
 * Created by Z-sharp on 16/05/17.
 */

package com.javafortesters.chap003;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        assertEquals("2+2=4",4,answer);

    }

    @Test
    public void canSubtractNineMinusFive(){
        int answer = 9-5;
        assertEquals("9-5=4",4,answer);

    }
}
