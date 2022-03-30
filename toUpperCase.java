package com.javaAssignment;

import java.util.Scanner;

public class toUpperCase
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string : ");
        String testString = sc.nextLine();
        String upperCaseString = "";
        for(int i=0;i<testString.length();i++)
        {
            if(testString.charAt(i)>=97 && testString.charAt(i)<=122)
            {
                upperCaseString+=(char)(testString.charAt(i)-32);
            }
            else
            {
                upperCaseString+=testString.charAt(i);
            }

        }
        System.out.println(upperCaseString);
    }
}
