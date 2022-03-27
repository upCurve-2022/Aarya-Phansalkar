package com.javaAssignment;

import java.util.Scanner;

public class stringLength
{
    public static void main(String[] args)
    {
        int noOfChara = 0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String testString = sc.nextLine();
        char[] arr = testString.toCharArray(); // toCharArray converts string to character array
        for(char var:arr)
        {
                noOfChara+=1;
        }
        System.out.println("Length of string is : "+noOfChara);
    }
}
