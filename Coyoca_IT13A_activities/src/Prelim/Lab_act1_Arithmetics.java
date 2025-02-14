/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prelim;

/**
 *
 * @author ADMIN
 */
public class Lab_act1_Arithmetics {
    
    public static void main(String[] args){
    
    int n= 10;
    int i= 4;
    int c= 6;
    
    int Res1= n*i+c;
    int Res2= (n-i)%c;
    int Res3= (n+i+c)/3;
    int Res4= n*c-(i*i);
    
    System.out.println("10*4+6      =" + Res1);
    System.out.println("(10-4)%6    =" + Res2);
    System.out.println("(10+4+6)/3  =" + Res3);
    System.out.println("10*6-(4*4)  =" + Res4);

    
    }
}
