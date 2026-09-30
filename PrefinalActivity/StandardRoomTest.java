/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */

    public class StandardRoomTest extends Room {

    private final double DAILY_RATE = 1500.00;

    // Constructor
    public StandardRoomTest(int roomNumber, String guestName,
                        int numberOfNights) {

        super(roomNumber, "Standard", guestName, numberOfNights);
    }

    // Override calculateBookingCost()
    @Override
    public double calculateBookingCost() {
        return DAILY_RATE * numberOfNights;
    }
}


