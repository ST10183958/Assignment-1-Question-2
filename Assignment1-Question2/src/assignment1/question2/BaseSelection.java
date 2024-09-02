/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1.question2;


public class BaseSelection {
    private String name;
    private String Option;
    
    String[] Titles = {"Name", "Gender", "Salary", "Location"};
    String[][] Employees = {
        {"Jason", "Mathew", "Conner","Angelica"},
        {"Male","Male","Male","Female"},
        {"R25000","R30000","R50000","R100000"},
        {"Durban","Capetown","Pietermaritzburg","Pretoria"},
    };
    
    public BaseSelection(String name, int Option) {
        int ArrayVal = 0;
        String ArrayName = null;
        

        int LoopVal = 0;
        
        for(String CurrentName : Employees[0]) {
            if(name.equals(CurrentName)) {
                System.out.println(Option);
                this.name = Titles[Option] + ":" + Employees[Option][LoopVal];
            }
            LoopVal++;
        }
    }
    
    public String getName() {
        return name;
    }
}
