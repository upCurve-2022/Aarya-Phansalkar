package com.javaAssignment;
import java.util.Scanner;

public class digitToWord
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        String numInput = sc.next();
        String wordOutput = "";
        for(int i=0;i<numInput.length();i++)
        {
            switch (numInput.charAt(i)) {
                case '0':
                    wordOutput += "Zero ";
                    break;
                case '1':
                    wordOutput += "One ";
                    break;
                case '2':
                    wordOutput += "Two ";
                    break;
                case '3':
                    wordOutput += "Three ";
                    break;
                case '4':
                    wordOutput += "Four ";
                    break;
                case '5':
                    wordOutput += "Five ";
                    break;
                case '6':
                    wordOutput += "Six ";
                    break;
                case '7':
                    wordOutput += "Seven ";
                    break;
                case '8':
                    wordOutput += "Eight ";
                    break;
                case '9':
                    wordOutput += "Nine ";
                    break;

            }
        }

        System.out.println(wordOutput);

    }
}
