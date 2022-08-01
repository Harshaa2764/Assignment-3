/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg2;

/**
 *
 * @author Harshada
 */
public class Student2 {
 
    int  rollsam=11;
    int rolljohn=12;
    long phonenosam=9303832517L;
    long phonenojohn=540917206L;
    String adrrsam="Pune";
    String addrjohn="Mumbai";
    
   public static void main(String[] args ){
       Student2 sam=new Student2();
       Student2 john=new Student2();
       System.out.println("Roll.no of Sam:" +sam.rollsam);
       System.out.println("Roll.no of John:" +john.rolljohn);
       System.out.println("Phone no. of Sam:" +sam.phonenosam);
       System.out.println("Phone no. of John:" +john.phonenojohn);
       System.out.println("Address of Sam:" +sam.adrrsam);
       System.out.println("Address of John:" +john.addrjohn);
    }
}
