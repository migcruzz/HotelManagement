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
public class Employee {
    
    private int id;
    private String name;
    private double salary;
    private String job;
    
    public Employee(int id, String name, double salary, String job){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.job = job;
    }
    
    public Employee(){}
    
    // Guetters and Setters;
    
    public int getId(){
        return id;
    }
    
    public String getName (){
        return name;
    }
    
    public double getSalaryl(){
        return salary;
    }
    
    public String getJob(){
        return job;
    }
    
    
    public void setId(int id){
        this.id=id;
    }
    
    public void setName(String name){
        this.name=name;
    }
        
    public void setSalary(double salary){
        this.salary=salary;
    }
    
    public void setJob(String job){
        this.job=job;
    }
    
    // Possible upgrade is to use String builder in Java;
    public void print(){
        
        System.out.println("ID:" + id);
        System.out.println("NAME:" + name);
        System.out.println("SALARY" + salary);
        System.out.println("JOB:" + job);
        
    
    }
    
}
