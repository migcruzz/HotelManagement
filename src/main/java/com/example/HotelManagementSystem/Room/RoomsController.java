/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.HotelManagementSystem.Room;

import com.google.common.base.CharMatcher;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author miguelcruz
 */
public class RoomsController {

  public static void addNewRoom(LinkedList<Room> rooms, Scanner scanner) {

    System.out.println("Enter Floor (integer value)");
    int floor = scanner.nextInt();
    System.out.println("Enter capacity (integer value)");
    int capacity = scanner.nextInt();
    System.out.println("Enter type (String)");
    String type = scanner.next();
    System.out.println("Enter description (String)");
    String description = scanner.next();
    System.out.println("Enter price (decimal value, double not float)");
    double price = scanner.nextDouble();

    // Build a new object
    Room room = new Room(rooms.size(), floor, capacity, type, description, price);
    rooms.add(room);

    System.out.println("Room added successfully !!!");
  }

  public static void showAllRooms(LinkedList<Room> rooms) {

    for (Room room : rooms) { // O room do tipo de dados Room contido na lista ligada rooms...
      System.out.println("---------------------------------------------------------");
      room.print();
      System.out.println("---------------------------------------------------------");

    }

  }

  public static Room getRoomById(LinkedList<Room> rooms, int id) {

    Room roomFound = new Room();

    for (Room room : rooms) {

      if (room.getId() == id) {

        roomFound = room;
        return roomFound;
      }

    }

    return null;
  }

  public static void editRoom(LinkedList<Room> rooms, Scanner scanner) {

    System.out.println("Enter Room ID: (or -1 to get all rooms)");
    int i = scanner.nextInt();
    int id;

    switch (i) {
      case -1:
        showAllRooms(rooms);
        System.out.println("Enter Room ID: (or -1 to get all rooms)");
        id = scanner.nextInt();
        break;

      default:
        id = i;
        break;
    }

    Room roomToEdit = getRoomById(rooms, id);
    //Room roomEdited = roomToEdit; future upgrade on the program

    if (roomToEdit != null) {

      System.out.println("Enter Room Floor: (or -1 to keep the same)");
      int floor = scanner.nextInt();

      if (floor == -1) {
        System.out.println("Room Floor:" + roomToEdit.getFloor() + "(same as before)");
      } else {
        roomToEdit.setFloor(floor);
        System.out.println("Room Floor:" + roomToEdit.getFloor() + "(new one)");
      }

      System.out.println("Enter Room Capacity: (or -1 to keep the same)");
      int capacity = scanner.nextInt();

      if (capacity == -1) {
        System.out.println("Room Capacity:" + roomToEdit.getCapacity() + "(same as before)");
      } else {
        roomToEdit.setCapacity(capacity);
        System.out.println("Room Capacity:" + roomToEdit.getCapacity() + "(new one)");
      }

      System.out.println("Enter Room Type: (or -1 to keep the same)");
      String type = scanner.next();

      if (type.equals("-1")) {
        System.out.println("Room Type:" + roomToEdit.getType() + "(same as before)");
      } else {
        roomToEdit.setType(type);
        System.out.println("Room Type:" + roomToEdit.getType() + "(new one)");
      }

      System.out.println("Enter Room Price (or -1 to keep the same)");
      double price = scanner.nextDouble();

      if (price == -1) {
        System.out.println("Room Price:" + roomToEdit.getPrice() + "(same as before)");
      } else {
        roomToEdit.setPrice(price);
        System.out.println("Room Price:" + roomToEdit.getPrice() + "(new one)");
      }

      System.out.println("Enter Room Description (or -1 to keep the same)");
      String description = scanner.next();

      if (price == -1) {
        System.out.println("Room Description:" + roomToEdit.getDescription() + "(same as before)");
      } else {
        roomToEdit.setDescription(description);
        System.out.println("Room Description:" + roomToEdit.getDescription() + "(new one)");
      }

      // Assigning the correct values:
      for (Room room : rooms) {

        if (room.getId() == id) {

          room = roomToEdit;

        }

      }

    } else {

      System.out.println("Room not found, try again !!!");

    }

  }

}
