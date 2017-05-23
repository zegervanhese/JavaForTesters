/*
 * Created by Z-sharp on 17/05/17.
 */

package com.javafortesters.chap004;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntegerExamplesTest {

    @Test
    public void integerExploration(){
        Integer four = new Integer(4);
        assertEquals("intValue returns 4",4 , four.intValue());
        Integer five = new Integer("5");
        assertEquals("intValue returns 5",5, five.intValue());
        Integer six = 6;
        assertEquals("autoboxing assignment for 6", 6, six.intValue());

        double lizanne = (123+7894)/0.001;
        System.out.println("De variabele Lizanne bevat " + lizanne);

        int lol = (2+9-14);
        System.out.println("De lollige bananen bevatten " + lol );

        assertEquals("MIN_VALUE equals -2147483648", -2147483648,Integer.MIN_VALUE);
        assertEquals("MAX_VALUE equals 2147483647", 2147483647,Integer.MAX_VALUE);
        assertTrue(4==4);
    }

    @Test
    public void canConvertIntToHex(){
        assertEquals("hex 13 is d", "d",
                Integer.toHexString(13));
        assertEquals("hex 10 is a", "a",
                Integer.toHexString(10));
        assertEquals("hex 3 is 3", "3",
                Integer.toHexString(3));
        assertEquals("hex 21 is 15", "15",
                Integer.toHexString(21));
        assertEquals("amai shanghai","5a", Integer.toHexString(90));
    }
}

