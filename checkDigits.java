package com.javaAssignment;
import java.util.Scanner;
/* 

Program to check if entered string has only digits

*/
public class checkDigits
{
    public static void main(String[] args)
    {
        boolean checkVar = true;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String testString = sc.nextLine();
        for (int i=0;i<testString.length();i++)
        {
          if((int)testString.charAt(i)<48 || (int)testString.charAt(i)>57)  //To check if character is digit using Ascii values 
          {
              checkVar = false;
          }
        }
        if(checkVar)  
        {
            System.out.print(testString+" : string has only digits ");
        }
        else
        {
            System.out.print("String contains other characters");
        }
    }
}
