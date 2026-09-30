/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */
public class SuiteRoom extends Room{
    private final double DAILY_RATE = 4000.00;
    private final double SERVICE_FEE = 1000.00;

    public SuiteRoom(int roomNumber, String guestName, int numberOfNights) {
        super(roomNumber, "Suite", guestName, numberOfNights);
    }

    @Override
    public double calculateBookingCost() {
        double numberOfNights = 0;
        return (DAILY_RATE * numberOfNights) + SERVICE_FEE;
    }
}


