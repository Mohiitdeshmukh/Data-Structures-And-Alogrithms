package com.Mohit.firstJavaProgram;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pkease enter a number: ");
        int n = input.nextInt();
        if (n<= 1){
            System.out.println("Neither prime nor composite");
            return;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                System.out.println("Not Prime");
                return;
            }
            c = c + 1;

            if (c * c > n) {
                System.out.println("Prime");
            }
        }
    }
}
