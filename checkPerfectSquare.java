package com.javaAssignment;

import java.util.Scanner;

public class checkPerfectSquare
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int  testNo = sc.nextInt();
        boolean check = false;
        for(int i=1;i<testNo;i++)
        {
            if(testNo/i==i && testNo%i==0)
            {
                check = true;
            }
        }
        if(check==true)
            System.out.println("Number is perfect square ");
        else
            System.out.println("Not a perfect square ");

    }
}
