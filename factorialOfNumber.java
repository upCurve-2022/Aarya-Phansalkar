package com.javaAssignment;

import java.util.Scanner;

public class factorialOfNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number whose factorial to be found : ");
        int  factorialNo = sc.nextInt();
        int result=1;
        for(int i=1;i<=factorialNo;i++)
        {
            result*=i;
        }
        System.out.println("Factorial value is  : "+result);
    }
}
