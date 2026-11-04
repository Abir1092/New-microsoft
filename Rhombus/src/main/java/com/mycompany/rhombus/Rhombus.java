/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rhombus;

/**
 *
 * @author ACC
 */
import java.util.Scanner;
public class Rhombus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EnterThe diagonal-1:");
        int d1=sc.nextInt();
        System.out.println("EnterThe diagonal-2:");
        int d2=sc.nextInt();
        double area =(0.5*(d1*d2));
        System.out.println("Rhombus area is"+area);
        
    }
}
