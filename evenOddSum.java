package com.javaAssignment;

import java.util.Scanner;

public class evenOddSum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int totalNo = sc.nextInt();
        int sumEven=0;
        int sumOdd=0;
        for(int i=0;i<=totalNo;i+=2)
        {
            sumEven += i;
        }
        for(int j=1; j<totalNo-1;j+=2)
        {
            sumOdd+=j;
        }
        System.out.println("Even sum is : "+sumEven);
        System.out.println("Odd sum is : "+sumOdd);
    }
}
