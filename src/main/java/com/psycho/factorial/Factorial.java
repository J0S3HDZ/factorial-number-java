/*
 * Factorial of a number
 */

package com.psycho.factorial;

import java.util.Scanner;

/**
 *
 * @author joseh
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt(); //Get input number from user
        
        int total = 1; // auxiliar/factorial total
        
        for (int i = x; i > 0; i--) {//inverted cicle
            total = i * total; //factorial multiplication
        }
        System.out.println("Factorial of "+x+" is "+total); //print factorial
        
    }
}
