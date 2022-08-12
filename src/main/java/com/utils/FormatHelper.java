package com.utils;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormatHelper {
    private static Locale localeVN = new Locale("vi", "VN");
    private static NumberFormat vn = NumberFormat.getInstance(localeVN);
    public static String formatMoney(double data) {
        return vn.format(data) + "VND";
    }

//    public static double formatMoneyBackToNumber(String data) throws ParseException{
//        return (long) vn.parse(data);
//    }
}
