/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multipy;

/**
 *
 * @author ACC
 */
import java.util.Scanner;
public class Multipy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number-1:");
        int a=sc.nextInt();
        System.out.println("Enter The number-2:");
        int b=sc.nextInt();
        int multify =a*b;
        System.out.println("The ans is" + multify);
    }
}
