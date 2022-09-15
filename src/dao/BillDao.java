/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Bill;

/**
 *
 * @author 94773
 */
public class BillDao {

    public static String getId() {
        int id = 1;
        try {
            ResultSet rs = Dboperations.getData("Select max(id) from bill");
            if (rs.next()) {
                id = rs.getInt(1);
                id = id + 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }

    public static void save(Bill bill) {
        String query = "insert into bill values('" + bill.getId() + "','" + bill.getName() + "','" + bill.getEmail() + "','" + bill.getDate() + "','" + bill.getTotal() + "','" + bill.getCreatedBy() + "')";
        Dboperations.setDataOrDelete(query, "Bill Details added succesfully");
    }

    public static ArrayList<Bill> getAllRecordsByInc(String date) {
       ArrayList<Bill> arrayList = new ArrayList<>();
        try {
            ResultSet rs = Dboperations.getData("Select * from bill where date like '%" + date + "%'");
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobileNumer(rs.getString("mobileNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setTotal(rs.getString("createdBy"));
                arrayList.add(bill);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static ArrayList<Bill> getAllRecordsByDesc(String date) {
        ArrayList<Bill> arrayList = new ArrayList<>();
    try {
            ResultSet rs = Dboperations.getData("Select * from bill where date like '%" + date + "%' order By id DESC");
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobileNumer(rs.getString("mobileNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setTotal(rs.getString("createdBy"));
                arrayList.add(bill);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}
