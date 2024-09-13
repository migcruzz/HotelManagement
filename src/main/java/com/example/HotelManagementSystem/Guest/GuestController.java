/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.HotelManagementSystem.Guest;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author miguelcruz
 */
public class GuestController {
    
    
    public static void addNewGuest(LinkedList<Guest> guests, Scanner scanner){
    
        System.out.println("");
        System.out.println("Enter Guest Name:");
        String name = scanner.next();
        System.out.println("Enter Guest email:");
        String email = scanner.next();
        System.out.println("Enter Guest discount:");
        float discount = scanner.nextFloat();

        Guest guest = new Guest(guests.size(), name, email, discount);
        guests.add(guest);
    
    }
    
    public static void showAllGuests(LinkedList<Guest> guests){
    
        for(Guest guest: guests){ 
            System.out.println("---------------------------------------------------------");
            guest.print();
            System.out.println("---------------------------------------------------------");

        }

    }
   
    public static void findGuestByName( LinkedList<Guest> guests, Scanner scanner) {
        
        System.out.println("Enter the Guest Name:");
        String name = scanner.next();
        
        for(Guest guest: guests){ 
            
            if(guest.getName().equals(name)){
            
            System.out.println("Guest found !");
            System.out.println("---------------------------------------------------------");
            guest.print();
            System.out.println("---------------------------------------------------------");
            return;
            }
        }
        System.out.println("Guest not found !");   
    }
    
    public static void editGuest(LinkedList<Guest> guests, Scanner scanner){
    
    
    }
    
    
}
