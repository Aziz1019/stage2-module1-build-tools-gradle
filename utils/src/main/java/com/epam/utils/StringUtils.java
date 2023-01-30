package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            if (Integer.parseInt(str) > 0){
                return false;
            }

            if (str.startsWith("0") && str.length() > 1) {
                return false;
            }
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
}
