package com.javaAssignment;

import java.util.Scanner;

public class linearSearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size wanted for array : ");
        int sizeArray = sc.nextInt();
        int [] testArray = new int[sizeArray];
        int i=0;
        //Accept n integers
        System.out.println("Enter array elements : ");
        for(int j=0;i<sizeArray;i++)
        {
            testArray[j] = sc.nextInt();

        }
        System.out.println("Enter number to search : ");
        int searchNo = sc.nextInt();
        for(i=0;i<=sizeArray;i++)
        {
            if (searchNo == testArray[i])
            {
                System.out.println("Number found!!");
                break;
            }

        }
        if(i==sizeArray)
        System.out.println("Number not found");

    }
}
