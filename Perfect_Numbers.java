package com.bridgelabz;

import java.util.Scanner;

public class Perfect_Numbers {
    public static void main(String[] args) {
        System.out.print("Enter x: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        m1(num);
    }
    static void m1(int num){
        int sum=0;
        for (int i=1;i<num;i++){
            if (num%i==0){
                sum=sum+i;
            }
        }  if (sum==num){
            System.out.println("The Number is Perfect Number");}
        else{
            System.out.println("The Number is Not Perfect Number");}

    }
}
