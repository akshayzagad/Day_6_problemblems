package com.bridgelabz;

import java.util.Scanner;

public class Prime_Numbers {
    public static void main(String[] args) {
        System.out.print("Enter x: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean res=m1(x);
        if (res){
            System.out.println("the x is prime number");
        } else {
            System.out.println("the x is not prime number");
        }
    }

    static boolean m1(int x) {
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        if (count==2) {
            return true;
        }
        else{
            return  false;
        }
    }
}
