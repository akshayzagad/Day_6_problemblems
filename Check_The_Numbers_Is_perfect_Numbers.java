package com.bridgelabz;

import java.util.Scanner;

public class Check_The_Numbers_Is_perfect_Numbers {
    public static void main(String[] args) {
        System.out.println("Enter the Start Number: ");
        System.out.println("Enter the End Number: ");
        Scanner scanner = new Scanner(System.in);
        int Start_Number = scanner.nextInt();
        int End_Number = scanner.nextInt();
        Sum_of_divisor_in_Range(Start_Number,End_Number);
    }
    static boolean Check_Perfect_Number(int n){
        int Sum_of_divisor =0;
        for (int i=1;i<n;i++){
            if (n%i==0){
                Sum_of_divisor=Sum_of_divisor+i;
            }
        }     return Sum_of_divisor==n ? true:false;
    }
    static void Sum_of_divisor_in_Range(int Start_num,int End_num) {
        for (int i = Start_num; i < End_num; i++) {
            boolean res = Check_Perfect_Number(i);
            if (res) {
                System.out.println(i);
            }
        }
    }
}
