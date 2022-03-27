package com.javaAssignment;

import java.util.Scanner;

public class reverseNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to reverse : ");
        int testVar = sc.nextInt();
        int result=0;
        while (testVar != 0 )
        {
            int rem = testVar%10;
            result = result*10+rem;
            testVar/=10;
        }
        System.out.println(""+result);



    }
}
