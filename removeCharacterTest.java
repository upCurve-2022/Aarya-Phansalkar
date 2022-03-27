package com.javaAssignment;

public class removeCharacterTest
{
    public static void main(String[] args)
    {
        StringBuilder testString = new StringBuilder("To test this string");
        for(int i=0;i<testString.length();i++)
        {
            if (testString.charAt(i)=='t' || testString.charAt(i)=='T')
            {
                testString.deleteCharAt(i);

            }
        }
        System.out.println(testString);
    }
}
