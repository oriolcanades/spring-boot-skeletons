package io.fikua.demo.util;

public class Utils {

    Utils() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isNullOrBlank(String string) {
        return string == null || string.isBlank();
    }

}
