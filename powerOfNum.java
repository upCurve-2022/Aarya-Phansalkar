package com.javaAssignment;

import java.util.Scanner;

public class powerOfNum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number and power: ");
        int testVar = sc.nextInt();
        int power = sc.nextInt();
        int res=1;
        for(int i=0;i<power;i++)
        {
            res*=testVar;
        }
        System.out.print("Result is : "+res);
    }
}
