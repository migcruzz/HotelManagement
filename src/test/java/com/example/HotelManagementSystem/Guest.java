/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.HotelManagementSystem;

import com.example.HotelManagementSystem.*;

/**
 *
 * @author miguelcruz
 */
public class Guest {
    
    private int id;
    private String name;
    private String email;
    private int discount;
    
    public Guest(int id, String name, String email, int discount){
    
        this.id = id;
        this.name = name;
        this.email = email;
        this.discount = discount;
        
    }
    
    public Guest(){}
    
    // Guetters and Setters;
    
    public int getId(){
        return id;
    }
    
    public String getName (){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public int getDiscount(){
        return discount;
    }
    
    
    public void setId(int id){
        this.id=id;
    }
    
    public void setName(String name){
        this.name=name;
    }
        
    public void setEmail(String email){
        this.email=email;
    }
    
    public void setDiscount(int discount){
        this.discount=discount;
    }
    
    
}
