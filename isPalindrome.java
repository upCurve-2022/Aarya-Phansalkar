package com.javaAssignment;
import java.util.Scanner;

public class isPalindrome
{
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("How many terms wanted in sequence : ");
            String testString = sc.next();
            String toCheck ="";
            for(int i=testString.length()-1;i>=0;i--)
            {
                toCheck += testString.charAt(i);
            }
            System.out.println("Original string is :"+testString+" and reverse string is :"+toCheck);
            if(toCheck.equals(testString))
            {

                System.out.println("String is palindrome");
            }
            else
                System.out.println("String is not a palindrome");
    }
}
