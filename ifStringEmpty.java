package com.javaAssignment;

import java.util.Scanner;

// using string.length() function
public class ifStringEmpty
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String testString = sc.nextLine();
        if(testString.length()==0)
        {
            System.out.print("String is empty");
        }
        else
        {
            System.out.print("String contains value : "+ testString);
        }
    }
}
