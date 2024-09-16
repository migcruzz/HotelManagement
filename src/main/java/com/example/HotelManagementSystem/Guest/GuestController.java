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

  public static void addNewGuest(LinkedList<Guest> guests, Scanner scanner) {

    System.out.println("");
    System.out.println("Enter Guest Name:");
    String name = scanner.next();
    System.out.println("Enter Guest email:");
    String email = scanner.next();
    System.out.println("Enter Guest discount(porcent):");
    float discount = scanner.nextFloat();

    Guest guest = new Guest(guests.size(), name, email, discount);
    guests.add(guest);

  }

  public static void showAllGuests(LinkedList<Guest> guests) {

    for (Guest guest : guests) {
      System.out.println("---------------------------------------------------------");
      guest.print();
      System.out.println("---------------------------------------------------------");

    }

  }

  public static void findGuestByName(LinkedList<Guest> guests, Scanner scanner) {

    System.out.println("Enter the Guest Name:");
    String name = scanner.next();

    for (Guest guest : guests) {

      if (guest.getName().equals(name)) {

        System.out.println("Guest found !");
        System.out.println("---------------------------------------------------------");
        guest.print();
        System.out.println("---------------------------------------------------------");
        return;
      }
    }
    System.out.println("Guest not found !");
  }

  public static void editGuest(LinkedList<Guest> guests, Scanner scanner) {

    System.out.println("Enter ID (INTEGER) or -1 to search Guest by name");

    int id = scanner.nextInt();

    if (id == -1) {
      findGuestByName(guests, scanner);
      System.out.println("Enter ID (INT)");
      id = scanner.nextInt();
    }

    Guest guest = guests.get(id);

    System.out.println("Enter Guest name (or -1 to keep it)");
    String name = scanner.next();
    if (name.equals("-1")) {
      name = guest.getName();
    }

    System.out.println("Enter Guest email (or -1 to keep it)");
    String email = scanner.next();
    if (name.equals("-1")) {
      email = guest.getEmail();
    }

    System.out.println("Enter Guest discount (or -1 to keep it)");
    double discount = scanner.nextFloat();
    if (discount == -1) {
      discount = guest.getDiscount();
    }

    guest.setId(id);
    guest.setName(name);
    guest.setEmail(email);
    guest.setDiscount(discount);

  }

}
