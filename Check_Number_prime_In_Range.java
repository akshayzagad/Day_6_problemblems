package com.bridgelabz;

import java.util.Scanner;

public class Check_Number_prime_In_Range {
    public static void main(String[] args) {
        System.out.println("Enter the Start Number: ");
        System.out.println("Enter the End Number: ");
        Scanner scanner = new Scanner(System.in);
        int Start_Number = scanner.nextInt();
        int End_Number = scanner.nextInt();
        Check_number_is_prime_In_Range(Start_Number,End_Number);
    }

    static boolean Check_number_is_prime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2 ? true:false;
    }
    static void Check_number_is_prime_In_Range(int a, int b){
        int count = 0;
        for (int i = a; i < b; i++) {
            boolean res = Check_number_is_prime(i);
            if (res) {
                System.out.println(i);
            }
        }
    }
}
