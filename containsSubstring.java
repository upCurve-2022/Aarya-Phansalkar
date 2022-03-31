package com.javaAssignment;
import java.util.Scanner;

public class containsSubstring
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string : ");
        String testStr = sc.nextLine();
        System.out.println("Enter sub string : ");
        String subStr = sc.nextLine();
        if(testStr.contains(subStr))
        {
            System.out.println("Substring present in original string ");
        }
        else
            System.out.println("Substring not present in original string ");
    }
}
