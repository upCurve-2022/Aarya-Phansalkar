package com.javaAssignment;

import java.util.Scanner;

public class binaryDecimalConversions
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimal number : ");
        int decimalNo = sc.nextInt();
        int i=1;
        int [] result = new int[8];
        //Decimal to Binary
            while (decimalNo != 0)
            {
                int rem = decimalNo % 2;
                result[i++] = rem;
                decimalNo /= 2;

            }

        for(int j=result.length-1;j>0;j--)
        {
            System.out.print(result[j]);
        }

    }
}
