/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangle;

/**
 *
 * @author ACC
 */
import java.util.Scanner;
public class Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The length:");
        int a=sc.nextInt();
        System.out.println("Enter The Width:");
        int b=sc.nextInt();
        int area=a*b;
        System.out.println("Rectangle area is" +area);
        
    }
}
