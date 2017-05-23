package com.javafortesters.domainobject;

/**
 * Created by Z-sharp on 18/05/17.
 */
public class TestAppEnv {
    public static final String DOMAIN = "192.123.0.3";
    public static final String PORT = "67";

    public static final String getUrl() {
    return "http://" + DOMAIN + ":" + PORT;
    }
}
