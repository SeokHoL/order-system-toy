package com.seokho.olinecoffee.util;

import java.util.UUID;

public class IdUtil {
    public static String generate() {
        return UUID.randomUUID().toString();
    }
}