/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.User;
import javax.swing.JOptionPane;
import java.sql.*;

public class Userdao {
    
    public static void save(User user){
        String query = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) "
                + "values('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobileNumber()+"','"+user.getAddress()+"','"+user.getPassword()+"','"+user.getSecurityQuestion()+"','"+user.getAnswer()+"','false')";
        Dboperations.setDataOrDelete(query,"Registered Succesfully! Wait for Admin Approval");
    }
    
    public static User login(String email,String password){
        User user = null;
        try{
            ResultSet rs = Dboperations.getData
        ("select *from user where email='"+email+"' and password='"+password+"'");
            while(rs.next()){
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    public static User getSecurityQuestion(String email){
        User user =null ;
        try{
            ResultSet rs = Dboperations.getData
        ("select *from user where email='"+email+"'");
            while(rs.next()){
                user = new User();
                user.setSecurityQuestion(rs.getString("SecurityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user ;
    }
    public static void update(String email,String newPassword ){
        String query = "update user set password = '"+ newPassword + "' where email = '" +email+"'";
        Dboperations.setDataOrDelete(query,"Password changed Succesfully");
    }
    
}
