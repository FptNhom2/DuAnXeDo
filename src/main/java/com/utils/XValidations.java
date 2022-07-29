package com.utils;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.JTextComponent;

public class XValidations {
    private static final String emailPattern = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
    private static final String phoneNumberPattern = "^((09|03|07|08|05)+([0-9]{8})\\b)$";

    public static boolean checkIsEmpty(Component ui, JTextComponent... data) {
        boolean isEmpty = false;
        for (JTextComponent field : data) {
            if (field.getText().isEmpty()) {
                MsgBox.alert(ui, "Bạn không thể để trống dữ liệu");
                isEmpty = true;
                field.setBackground(Color.yellow);
                break;
            } else {
                field.setBackground(Color.white);
            }
        }
        return isEmpty;
    }

    public static boolean checkPhoneNumberPttern(Component ui, JTextComponent data) {
        boolean isValidate = false;
        if (data.getText().trim().matches(phoneNumberPattern)) {
            isValidate = true;
            data.setBackground(Color.white);
        } else {
            data.setBackground(Color.yellow);
            MsgBox.alert(ui, "Không đúng định dạng số điện thoại! Vui lòng nhập lại");
        }
        return isValidate;
    }

    public static boolean checkEmailPttern(Component ui, JTextComponent data) {
        boolean isValidate = false;
        if (data.getText().trim().matches(emailPattern)) {
            isValidate = true;
            data.setBackground(Color.white);
        } else {
            data.setBackground(Color.yellow);
            MsgBox.alert(ui, "Không đúng định dạng email! Vui lòng nhập lại");
        }
        return isValidate;
    }

    public static List<String> checkGia(Component ui, JTextComponent... data) {
        String error1 = "Giá không được bằng 0 hoặc số âm";
        String error2 = "Chỉ được điền vào chữ số";
        List<String> errors = new ArrayList<>();
        try {
            for (JTextComponent field : data) {
                if (!field.getText().matches("[0-9]")) {
                    errors.add(error2);
                    return errors;
                } else if (Double.valueOf(field.getText()) <= 0) {
                    errors.add(error1);
                }

            }
        } catch (NumberFormatException e) {
            MsgBox.alert(ui, e.getMessage() + "ffff");
        }
        return errors;
    }

    public static void displayErrors(Component ui, List<String> errors) {
        for (String error : errors) {
            MsgBox.alert(ui, error);
        }
    }
}
