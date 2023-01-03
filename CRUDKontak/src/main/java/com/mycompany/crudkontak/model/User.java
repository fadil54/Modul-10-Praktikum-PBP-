/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudkontak.model;

/**
 *
 * @author Acer SPIN
 */
public class User {
    private String nama,telepon,alamat,id;
    
    public User(){};
    public User(String nama, String telepon, String alamat){
        this.nama = nama;
        this.telepon = telepon;
        this.alamat = alamat;
    }
    public User(String nama, String telepon, String alamat, String id){
        this.nama = nama;
        this.telepon = telepon;
        this.alamat = alamat;
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getId() {
        return id;
    }

    
}
