package com.javaAssignment;

import java.util.Scanner;

public class removeHyphen
{
    public static void main(String[] args)
    {


        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String testString = sc.nextLine();
        StringBuilder newString = new StringBuilder(testString);
        for(int i=0;i<newString.length();i++)
        {
            if(newString.charAt(i)=='-')
            {
                if(((int)newString.charAt(i-1)>=48 && (int)newString.charAt(i-1)<=57) && ((int)newString.charAt(i+1)>=48 && (int)newString.charAt(i+1)<=57))
                {
                    newString.deleteCharAt(i);
                }
            }
        }
        System.out.print(newString);
    }
}
