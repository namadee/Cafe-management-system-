/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import java.sql.*;

public class CategoryDao {
    
    public static void save(Category category){
        String query = "insert into category(name) values ('"+category.getName()+"')";
        Dboperations.setDataOrDelete(query,"Category added succesfully");
    }
    
    
    public static ArrayList<Category> getAllRecord(){
        ArrayList<Category> arrayList = new ArrayList<>();
        try{
             ResultSet rs = Dboperations.getData("Select * from category");
             while(rs.next()){
                 Category category = new Category();
                 category.setId(rs.getInt("id"));
                 category.setName(rs.getString("name"));
                 arrayList.add(category);
             }
             
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void delete(String id){
        String query = "delete from category where id = '"+id+"' ";
                Dboperations.setDataOrDelete(query,"Category Deleted succesfully");
    }

    public static void update(Category id) {
       String query = "update from category where id = '"+id+"' ";
        Dboperations.setDataOrDelete(query, "Category Updated Successfully");
    }
}
