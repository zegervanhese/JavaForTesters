package com.javafortesters.chap008;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SelectionsAndDecisions {
    @Test
    public void moreTernary(){
    String url = "www.eviltester.com";
    url = url.startsWith("http://") ? url : addHttp(url);

    assertTrue(url.startsWith("http://"));
    assertEquals("http://www.eviltester.com",url);
    }

    private String addHttp(String url) {
        return "http://" + url;
    }

    @Test
    public void catOrCats(){
        int numberofcats = 1;
        assertEquals("1 == cat","cat", (numberofcats == 1) ? "cat" : "cats");

        numberofcats = 0;
        assertEquals("0 == cats", "cats", (numberofcats == 1) ? "cat" : "cats");

        numberofcats = 2;
        assertEquals("2 == cats", "cats", (numberofcats == 1) ? "cat" : "cats");
    }

    @Test
    public void catOrCatsAsMethod(){
        assertEquals("1 == cat", "cat", catOrCats(1));
        assertEquals("0 == cats", "cats", catOrCats(0));
        assertEquals("2 == cats", "cats", catOrCats(2));
    }

    private String catOrCats(int numberOfCats){
        return (numberOfCats == 1) ? "cat" : "cats";
        }

    @Test
    public void ifAddHttp(){
        String url = "www.testsidestory.com";
        if(!url.startsWith("http://")){
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.testsidestory.com",url);
    }

    @Test
    public void assertTrueIfTrue(){
        boolean truthy = true;
        if(truthy)
            assertTrue(truthy);
    }

    @Test
    public void assertFalseifTrue(){
        boolean truthy2 = true;
        if(truthy2){
            assertTrue(truthy2);
            assertFalse(!truthy2);
        }
    }

}
