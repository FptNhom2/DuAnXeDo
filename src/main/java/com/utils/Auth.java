package com.utils;

import com.entity.NhanVien;
// static dùng chung trên toàn ứng dụng
public class Auth {
    public static NhanVien user = null; // duy trì user đăng nhập vào hệ thống, mục đích để kiểm tra người ta làm việc gì đó mình còn biết ai làm
    // để xóa bỏ user đã đăng nhập trước đó ( đăng xuất )
    public static void clear(){
        Auth.user = null;
    }
    // kiểm tra user đã đăng nhập hay chưa
    public static boolean isLogin(){
        return Auth.user != null;
    }
    // kiểm tra có phải trưởng phòng hay không
    public static boolean isManager(){
        return Auth.isLogin()&& user.getVaiTro();
    }
}
