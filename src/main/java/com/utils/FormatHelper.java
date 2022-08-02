package com.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatHelper {
    public static String formatMoney(double data){
        Locale localeVN = new Locale("vi","VN");
        NumberFormat vn = NumberFormat.getInstance(localeVN);
        return vn.format(data) + "VND";
    }
}
