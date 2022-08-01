/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg2;

import java.util.Scanner;

/**
 *
 * @author Harshada
 */
public class Average {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double x = in.nextDouble();
        System.out.print("Enter the second number: ");
        double y = in.nextDouble();
        System.out.print("Enter the third number: ");
        double z = in.nextDouble();
        System.out.print("The average value is " + average(x, y, z)+"\n" );
    }

  public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
}
