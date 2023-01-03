/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudkontak.controller;
import com.mycompany.crudkontak.Connection.Koneksi;
import com.mycompany.crudkontak.model.User;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Acer SPIN
 */
public class Controller {
    static Statement statement;
    static Connection connect;
    static ResultSet resultData;
    
    public static void add(User user){
        boolean data = true;
        try {  
            connect = Koneksi.getConnection();
            statement = connect.createStatement();
            String query = "insert into kontak values(null," + "'" + user.getNama() + "'" + "," + "'" + user.getTelepon() + "'" + "," + "'" + user.getAlamat() + "'" + ")";
            data = statement.execute(query);
//            connect.close();
//            statement.close();
            JOptionPane.showMessageDialog(null,"Data berhasil ditambahkan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Data gagal ditambahkan");
            e.printStackTrace();
        }
    }
    
    public static void update(User user){
        
        boolean data = true;
        try { 
            connect = Koneksi.getConnection();
            statement = connect.createStatement();
            String query = "UPDATE kontak SET nama = " + "'" + user.getNama() + "'" + "," + "telepon = " + "'" + user.getTelepon() + "'" + "," + "alamat = " + "'" + user.getAlamat() + "'" +  " WHERE id = " + user.getId();
            data = statement.execute(query);
//            connect.close();
//            statement.close();
               
            JOptionPane.showMessageDialog(null,"Data berhasil diupdate");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Data gagal diupdate");
            e.printStackTrace();
        }
       
    }
    
    public static void delete(User user){
        boolean data = true;
        try { 
            System.out.println(user.getId());
            connect = Koneksi.getConnection();statement = connect.createStatement();
            String query = "DELETE FROM kontak where id = " + user.getId();
            data = statement.execute(query);
//            connect.close();
//            statement.close();
            JOptionPane.showMessageDialog(null,"Data berhasil dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Data gagal diupdate");
            e.printStackTrace();
        }
    }
    public static ResultSet getData(){
        boolean data = true;
        try { 
            connect = Koneksi.getConnection();
            statement = connect.createStatement();
            String query = "SELECT* from kontak";
            resultData = statement.executeQuery(query);
//            connect.close();
//            statement.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Data gagal diambil");
            e.printStackTrace();
        }
        return resultData;
    }
    
}

