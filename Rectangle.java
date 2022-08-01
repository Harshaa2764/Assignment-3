/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg2;

/**
 *
 * @author Harshada
 */
public class Rectangle {
  int l1=4,b1=5,l2=5,b2=8;
  public static void main(String[] args)
    {
            Rectangle rect=new Rectangle();
            System.out.println("Area of rectangle 1 is :"+rect.Area(rect.l1,rect.b1));
            System.out.println("Area of rectangle 2 is :"+rect.Area(rect.l2,rect.b2));
     }
     public int Area(int length,int breadth)
     {
               return length*breadth;   
     }  
}
