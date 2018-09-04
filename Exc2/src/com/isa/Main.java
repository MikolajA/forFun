package com.isa;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println(decode("one=1&two=2"));
        System.out.println(decode(""));

    }

    public static Map<String, String> decode(String s) {


        Map<String, String> map = new HashMap<String, String>();

        try {

            if (s.isEmpty()) return Collections.emptyMap();

            if (s == null) return null;

            for (String value : s.split("&")) {

                String[] pairs = value.split("=", 2);

                map.put(pairs[0], pairs[1]);

            }

        } catch (IllegalArgumentException e) {
            System.out.println("the given String has an invalid format");
        }
        return map;
    }
}
