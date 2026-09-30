/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */

    
  public class DeluxeRoom extends Room {

    private final double DAILY_RATE = 2500.00;
    private final double BREAKFAST_FEE = 300.00;

    // Constructor
    public DeluxeRoom(int roomNumber, String guestName,
                      int numberOfNights) {

        super(roomNumber, "Deluxe", guestName, numberOfNights);
    }

    // Override calculateBookingCost()
    @Override
    public double calculateBookingCost() {

        return (DAILY_RATE * numberOfNights)
                + (BREAKFAST_FEE * numberOfNights);
    }
}


