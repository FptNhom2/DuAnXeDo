package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Xjdbc {
    public static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String url = "jdbc:sqlserver://localhost:1433;databaseName = EduSys";
    public static String username = "sa";
    public static String password = "123";
    // nap driver
            static{
                try {
                    Class.forName(driver);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
    // nạp truyền giá trị đối số vào prepareStatement
    public static PreparedStatement getStmt(String sql, Object...args) throws SQLException{
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement pstmt = null;
        if(sql.trim().startsWith("{")){
            pstmt = con.prepareCall(sql);
        }
        else{
            pstmt=con.prepareStatement(sql);
        }
        for(int i=0; i<args.length;i++){
                pstmt.setObject(i+1, args[i]);
        }
        return pstmt;
    }
    
    //thao tác (insert, update, delete) - thực thi prepareStatement đã được truyền ở hàm trên
    public static int update(String sql, Object...args) throws SQLException{
        try {
            PreparedStatement stmt = Xjdbc.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } 
            finally{
                stmt.getConnection().close();
            }
        } 
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    } // => int
    
    public static ResultSet query(String sql,Object...args){
        try {
            PreparedStatement stmt = Xjdbc.getStmt(sql, args);
            return stmt.executeQuery();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    } // => ResultSet
    
    //thao tác truy vấn (select)
    public static Object value(String sql, Object...args){
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    } // => Object

}
