/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divide;

/**
 *
 * @author ACC
 */
import java.util.Scanner;
public class Divide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number-1:");
         int a=sc.nextInt();
        System.out.println("Enter The number-2:");
        int b=sc.nextInt();
        int divide=a/b;
        System.out.println("The ans is" + divide);
    }
}
