package com.javaAssignment;

import java.util.Scanner;

public class patternPrinting
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rowNumber = sc.nextInt();
        for(int i=0;i<rowNumber;i++)
        {
            System.out.print("\n");

            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
        }
    }
}
