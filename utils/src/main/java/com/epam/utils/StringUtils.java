package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            if (str.startsWith("0") && str.length() > 1) {
                return false;
            } else if (Integer.parseInt(str) > 0){
                return false;
            }
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
}
