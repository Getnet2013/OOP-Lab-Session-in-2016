/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12016;
import java.util.Scanner;
public class Student {
    public String name;
    public int age;
    public String department;
    // Default constructor
     Student() {
        // Default values
        this.name = "Unknown";
        this.age = 0;
        this.department = "Unknown";
    }
    // Parameterized constructor
     Student(String name, int age, String department) {
        name = name;
       age = age;
        department = department;
    }
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter student department:");
        String department = scanner.nextLine();
        // Creating an object using the parameterized constructor
        Student stud = new Student(name, age, department);
        // Displaying student information
        System.out.println("\nStudent Information:");
        System.out.println("Your Name: " + stud.name);
        System.out.println("Your Age: " + stud.age);
        System.out.println("Your Department: " + stud.department);

    }
}
