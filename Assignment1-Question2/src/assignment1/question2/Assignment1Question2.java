/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment1.question2;
import java.util.Scanner;


public class Assignment1Question2 {


    public static void main(String[] args) {
       Scanner ScannerObj = new Scanner(System.in);
       System.out.println("Current employees: Jason, Mathew, Conner, Angelica");
       
       System.out.print("Search for employee:");
       String EmployeeInput = ScannerObj.nextLine();
       
       System.out.println('\n');
       System.out.println("Select Option bellow");
       System.out.println("Gender = 2");
       System.out.println("Salary = 2");
       System.out.println("Location = 3");
       System.out.print("Option: ");
       int OptionSelect = ScannerObj.nextInt();
       
       BaseSelection Employee = new BaseSelection(EmployeeInput,OptionSelect);
       

       System.out.println(Employee.getName());
       
    }  
}
