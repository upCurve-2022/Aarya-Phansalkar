package com.javaAssignment;

import java.util.Scanner;

public class simpleInterestCalc
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principle amount, no of years and rate : ");
        int principleAmt = sc.nextInt();
        int years = sc.nextInt();
        int rate = sc.nextInt();
        float SI = (float)(principleAmt*rate*years)/100;
        System.out.println("Simple Interest is : "+SI);
    }
}
