package com.javaAssignment;
import java.util.Scanner;

public class wordsInString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string : ");
        String testString = sc.nextLine();
        char [] strArray = testString.toCharArray();
        int wordCount =0;
        for(int i=0;i<strArray.length;i++)
        {
            if(strArray[i]==' ')
            {
                wordCount++;
            }
        }
        System.out.println("Number of words are : "+(wordCount+1));
    }
}
