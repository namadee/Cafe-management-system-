/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.User;
import javax.swing.JOptionPane;
import java.sql.*;

public class Userdao {

    public static void save(User user) {
        String query = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) "
                + "values('" + user.getName() + "','" + user.getEmail() + "','" + user.getMobileNumber() + "','" + user.getAddress() + "','" + user.getPassword() + "','" + user.getSecurityQuestion() + "','" + user.getAnswer() + "','false')";
        Dboperations.setDataOrDelete(query, "Registered Succesfully! Wait for Admin Approval");
    }

    public static User login(String email, String password) {
        User user = null;
        try {
            ResultSet rs = Dboperations.getData("select *from user where email='" + email + "' and password='" + password + "'");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static User getSecurityQuestion(String email) {
        User user = null;
        try {
            ResultSet rs = Dboperations.getData("select *from user where email='" + email + "'");
            while (rs.next()) {
                user = new User();
                user.setSecurityQuestion(rs.getString("SecurityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static void update(String email, String newPassword) {
        String query = "update user set password = '" + newPassword + "' where email = '" + email + "'";
        Dboperations.setDataOrDelete(query, "Password changed Succesfully");
    }

    public static void ChangePassword(String email, String OldPassword, String NewPassword) {
        try {
            ResultSet rs = Dboperations.getData("Select * from user where email ='" + email + "' and password = '" + OldPassword + "'");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void ChangeSecurityQuestion(String email, String password, String securityQuestion,String answer) {
        try {
            ResultSet rs = Dboperations.getData("Select * from user where email ='" + email + "' and password = '" + password + "'");
            if(rs.next()){
            update(email,securityQuestion,answer);
            }
            else{
                JOptionPane.showMessageDialog(null, "Password is wrong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void update(String email,String securityQuestion,String answer){
        String query = "update user set securityQuestion = '"+securityQuestion+"',answer = '"+answer+"'where email = '"+email+"'";
        Dboperations.setDataOrDelete(query, "Security Question changed Succesfully");

    }
    
}
