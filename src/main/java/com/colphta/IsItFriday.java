package com.colphta;

import java.util.HashMap;
import java.util.Map;

public class IsItFriday {

    private static Map<String, String> isItFriday = new HashMap(){
        {
            put("Sunday", "No");
            put("Monday", "No");
            put("Tuesday", "No");
            put("Wednesday", "No");
            put("Thursday", "No");
            put("Friday", "Yes");
            put("Saturday", "No");

        }
    };

    public static String day(String day) {
        return IsItFriday.isItFriday.get(day);
    }
}
