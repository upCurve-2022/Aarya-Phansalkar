package com.javaAssignment;
import java.util.Scanner;

public class ASCIIOfCharacter 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character whose ASCII to be found : ");
        char testChar = sc.next().charAt(0);
        System.out.println("ASCII of entered character is : "+(int)testChar);
    }
}
