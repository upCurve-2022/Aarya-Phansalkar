package com.javaAssignment;
import java.util.Scanner;

public class stringComparisons
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string 1: ");
        String testString1 = sc.nextLine();
        System.out.print("Enter a string 2: ");
        String testString2 = sc.nextLine();
        //Method 1 - Using compareTo() -----> Returns 0 if strings equal
        System.out.println(testString1.compareTo(testString2));
        //Method 2 - Using equals() -----> Returns true if strings equal
        System.out.println(testString1.equals(testString2));
        //Method 3 - Using == operator -----> Returns true if string objects are same
        System.out.println(testString1==testString2);

    }
}
