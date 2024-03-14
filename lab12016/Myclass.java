/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab12016;


public class Myclass {

    private int privateVariable;

    // Getter method to access the value of privateVariable
    public int getPrivateVariable() {
        return privateVariable;
    }

    // Setter method to modify the value of privateVariable
    public void setPrivateVariable(int value) {
        privateVariable = value;
    }
    public static void main(String[] args) {
         JavaClass obj = new JavaClass();

        // Set the value of privateVariable using the setter method
        obj.setPrivateVariable(10);

        // Get the value of privateVariable using the getter method
        int value = obj.getPrivateVariable();
        System.out.println("Value of privateVariable: " + value);
        System.out.println("Value of private variable :");
    }}
    

 

