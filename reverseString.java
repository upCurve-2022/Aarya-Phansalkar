package com.javaAssignment;
import java.util.Scanner;

public class reverseString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string to reverse : ");
        String testString = sc.next();
        String reverseString = "";
        for(int i=testString.length()-1;i>=0;i--)
        {
            reverseString += testString.charAt(i);
        }
        System.out.println("Original string is :"+testString+"\nReverse string is :"+reverseString);

    }

}
