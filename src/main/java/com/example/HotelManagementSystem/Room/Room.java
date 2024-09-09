/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.HotelManagementSystem.Room;

import com.example.HotelManagementSystem.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

/**
 *
 * @author miguelcruz
 */
public class Room {
    
    private int id;
    private int floor;
    private int capacity;
    private String type;
    private String description;
    private double price;
    private LinkedList<String> reservedDates;
    
    
    public Room(int id, int floor, int capacity, String type, String description, double price){
    
        this.id = id;
        this.floor = floor;
        this.capacity = capacity;
        this.type = type;
        this.description = description;
        this.price = price;
        reservedDates = new LinkedList<>(); // Criação de um novo arrray list
       
    }
    
    public Room(){
        reservedDates = new LinkedList<>();
    }
    
    // Getters
    
    public int getId(){
        return id;
    }
    
    public int getFloor(){
        return floor;
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    public String getType(){
        return type;
    }
    
    public String getDescription(){
        return description;
    }
    
    public double getPrice(){
        return price;
    }
    
    
    
   // Settters
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setFloor(int floor){
        this.floor = floor;
    }
    
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    
    public void Reserve(LocalDate startDate, LocalDate finishDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        for (LocalDate date = startDate;date.isBefore(finishDate); date = date.plusDays(1)){
            String d = date.format(formatter); // Formatação da data encontrada no formato desejado
            reservedDates.addLast(d);
        }
    
    }
    
    public boolean isReserved(LocalDate startDate, LocalDate finishDate){
        boolean b = false;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // Vai procurar a reserva e depois vai retornar um valor booleno para saber se realmente foi reservado ou não.
        for (LocalDate date = startDate;date.isBefore(finishDate); date = date.plusDays(1)){
            String d = date.format(formatter); // Formatação da data encontrada no formato desejado
            if(reservedDates.contains(d)){ 
                b = true;
                break;
            }
           
        }
        return b;
    }
    
    public static void showAllRooms(LinkedList<Room> rooms){
    
        for(Room room: rooms){ // O room do tipo de dados Room contido na lista ligada rooms...
            System.out.println("---------------------------------------------------------");
            room.print();
            System.out.println("---------------------------------------------------------");

        }
        
    }
    
   
     public void print(){
        
        System.out.println("ID:" + id);
        System.out.println("FLOOR:" + floor);
        System.out.println("CAPACITY" + capacity);
        System.out.println("TYPE:" + type);
        System.out.println("DESCRIPTION:" + description);
        System.out.println("PRICE:" + price);
        
    
    }
    
    
}
