package com.bridgelabz;

import java.util.Scanner;

public class Reverse_Numbers {
    public static void main(String[] args) {
        System.out.println("enter the number=  ");
        Scanner scanner=new Scanner(System.in);
        int Numbers= scanner.nextInt();
        Reverse_the_Number(Numbers);
    }
    static void Reverse_the_Number(int Numbers){
        int Reverse=0;
        while (Numbers!=0){
            int Remainder=Numbers%10;
            Reverse=Reverse*10+Remainder;
            Numbers=Numbers/10;
        }
        System.out.println("Reverce_Numbers==>" +Reverse);
    }
}
