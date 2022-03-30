package com.javaAssignment;

import java.util.Scanner;

public class stringConcatenation
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1 : ");
        String testString = sc.nextLine();
        System.out.println("Enter string 2 : ");
        String testString1 = sc.nextLine();
        testString+=testString1;
        System.out.println("Concatenated string : "+testString);
    }
}
