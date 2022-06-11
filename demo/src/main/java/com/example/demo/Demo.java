package com.example.demo;
import com.example.codec.CodecLocator;

import java.io.UnsupportedEncodingException;

public class Demo {

    public static void test() throws Exception {
        CodecLocator locator = new CodecLocator();
        System.out.println(locator.getCodecSet("US-ASCII").getClass().getName());
        System.out.println(locator.getCodecSet("UTF-8").getClass().getName());
    }

    public static String utf8() throws UnsupportedEncodingException {
        CodecLocator locator = new CodecLocator();
        return locator.getCodecSet("UTF-8").getClass().getName();
    }

    public static String ascii() throws UnsupportedEncodingException {
        CodecLocator locator = new CodecLocator();
        return locator.getCodecSet("US-ASCII").getClass().getName();
    }
}
