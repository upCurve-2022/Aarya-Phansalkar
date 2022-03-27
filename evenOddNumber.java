package com.javaAssignment;

import java.util.Scanner;

public class evenOddNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int testVar = sc.nextInt();
        if(testVar%2==0)                 //To check if number entered even
        {
            System.out.print("Number is even ");
        }
        else
            System.out.print("Number is odd ");
    }
}
