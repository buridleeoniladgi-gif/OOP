/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */
public class TestEmployee {
    
    public static void main(String[] args) {

        // Create Employee object
        Employee employee = new Employee(
            "EMP-001",
            "Maria Cruz",
            "IT",
            25,
            700.00
        );

        // Display employee payroll
        employee.displayPayroll();
    }
}
    

