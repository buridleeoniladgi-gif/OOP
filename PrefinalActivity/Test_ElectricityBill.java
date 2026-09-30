/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */
public class Test_ElectricityBill {
   

    public static void main(String[] args) {

        // Object 1 -
        ElectricityBill bill1 = new ElectricityBill(
            "EL-1001",
            "Juan Santos",
            "Residential",
            1250,
            1475
        );

        // Object 2 - 
        ElectricityBill bill2 = new ElectricityBill(
            "EL-1002",
            "Maria Cruz",
            "Residential",
            2000,
            2075
        );

        // Object 3 -
        ElectricityBill bill3 = new ElectricityBill(
            "EL-1003",
            "ABC Store",
            "Commercial",
            3500,
            3850
        );

        // Display results
        bill1.displayBill();
        bill2.displayBill();
        bill3.displayBill();
    }
}


    
   