package com.javafortesters.chap007;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VariablesTest {

    @Test
    public void variableNaming() {
        String $aString = "bob";
        float £owed = 10F;
        int aMount = 4;
        long Amount = 5;
        String A0123456789bCd$f = "ugh";

        assertEquals(4, aMount);
        assertEquals(5, Amount);
        assertEquals(10.0F, £owed, 0);
        assertEquals("bob", $aString);
        assertEquals("ugh", A0123456789bCd$f);
    }

    @Test
    public void BooleanType(){
        boolean truthy = true;
        boolean falsey = false;
        boolean truthy2 = Boolean.TRUE;
        boolean falsey2 = Boolean.FALSE;
        assertTrue(truthy);
        assertFalse(falsey);
        assertTrue(truthy2);
        assertFalse(falsey2);
    }

    @Test
    public void IntegerTypes(){
        byte aByteHas1Byte;
        short aShortHas2Bytes;
        int anIntHas4Bytes;
        long aLongHas8Bytes;
        System.out.println(
                "* 'byte' range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println(
                "* 'short' range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println(
                "* 'int' range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println(
                "* 'long' range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
    }

    @Test
    public void FloatingPointType(){
        float singlePrecision32bit;
        double doublePrecision64bit;
        System.out.println(
                "* 'float' range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println(
                "* 'double' range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        singlePrecision32bit = 10.0F; //suffix F to get a float
        assertEquals(10F,singlePrecision32bit,0);
        doublePrecision64bit = 20.0; //defaults to double
        assertEquals(20D,doublePrecision64bit,0);
    }

    @Test
    public void CharacterType(){
        char aChar = '\u0023';
        assertEquals(aChar,'#');
    }

    @Test
    public void traditionalOperatorsExplored(){
        assertEquals(4,2+2);
        assertEquals(5L,10L-5L);
        assertEquals(25.0F,12.5F*2F,0);
        assertEquals(30.2D,120.8D/4D,0);
        assertEquals("To be honest, I expected abcd","abcd","ab"+"cd");
        assertEquals(1,9%2);
    }

    @Test
    public void assignmentOperatorsExplored() {
        String ab = "ab";
        assertEquals("ab", ab);

        int num = 10;
        assertEquals(10, num);

        num += 2;
        assertEquals("+= increments by", 12, num);

        num -= 4;
        assertEquals("-= decrements by", 8, num);

        num *= 2;
        assertEquals("*= multiplies by", 16, num);

        num /= 4;
        assertEquals("*= divides by", 4, num);

        num %= 3;
        assertEquals("*= modulus of", 1, num);

    }

        @Test
        public void incrementDecrementOperatorsExplored(){
            int num2 = 10;
            assertEquals(11,++num2);
            assertEquals(10,--num2);
            assertEquals(10,num2++);
            assertEquals(11,num2);
            assertEquals(11,num2--);
            assertEquals(10,num2);
        }

        @Test
        public void booleanOperatorsExplored(){
            assertTrue(4 == 4);
            assertTrue(4 != 5);
            assertTrue(3<4);
            assertTrue(6>=6);
            assertTrue(!false);
            boolean truthy = true;
            assertFalse(!truthy);
        }

        @Test
        public void conditionalOperatorsExplored(){
            assertTrue(true && true);
            assertTrue(true || false);
            assertTrue(false || true);
            assertFalse(false || false);
            assertFalse(false && true);
        }

        @Test
        public void ternaryOperatorsExplored(){
            int x;
            x = 4>5 ? 2: 1;
            assertEquals(1,x);
            assertTrue(5>4 ? true : false);
        }

        @Test
        public void bitwiseOperatorsExplored(){
            assertEquals(0b0001,0b1001 & 0b0101);
            assertEquals(0b1101,0b1001 | 0b0101);
            assertEquals(0b1100,0b1001 ^ 0b0101);
            int x2 = 0b0001;
            assertEquals("11111111111111111111111111111110",Integer.toBinaryString(~x2));
        }

        @Test
        public void operatorPrecedenceExplored(){
            assertEquals(8,4+2*6/3);
            assertEquals(12, (((4+2)*6)/3));
        }

        @Test
        public void someStringMethods(){
            String aString = "abcdefg";

            assertEquals(7,aString.length());
            assertTrue(aString.compareToIgnoreCase("ABcDeFG")==0);
            assertTrue(aString.contains("bc"));
            assertTrue(aString.startsWith("abc"));
            assertEquals('c',aString.charAt(2));
            assertEquals("efg",aString.substring(4));

        }

    }