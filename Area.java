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
public class Area {
      int length,breadth;
  public Area(int l,int b)
  {
       length=l;
       breadth=b;
   }
  public int getArea()
  {
        return length*breadth;
  }
  
  public static void main(String[] args)
  {
     int l,b;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter length of Rectangle:"); 
     
     l=s.nextInt();
     System.out.println("Enter breadth of Rectangle:");
     b=s.nextInt();
     Area a=new Area(l,b);
    System.out.println("Area of Rectangle :"+a.getArea());
  }
}
