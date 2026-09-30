/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */
public class HotelRoomBookingTest {
    
    public static void main(String[] args) {

        Room[] rooms = {
            new StandardRoomTest(101, "Kenn rose ", 3),
            new DeluxeRoom(202, "Erlee  Igdalino", 2),
            new SuiteRoom(301, "Carlo Santos", 2)
        };

        for (Room room : rooms) {
            room.displayBooking();
        }
    }
}


