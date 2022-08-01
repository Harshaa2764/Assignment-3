/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg2;

/**
 *
 * @author Harshada
 */
public class Area2 {
    int length,breadth;
Area2(int l, int b)
{
        length = l;
        breadth = b;
}
public int setDim(){
int results = length * breadth;
return results;
}
 public void getArea2(){
System.out.println("Area of rectangle is = " +  setDim());
}
public static void main(String []args){
Area2 x =new Area2(6,5);
x.getArea2();
    
}
}
