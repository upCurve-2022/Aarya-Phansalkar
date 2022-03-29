package com.javaAssignment;

public class replaceCharacter
{
    public static void main(String[] args)
    {
        String testString = "I am always ready to learn although I do not always like being taught.";
        String modifiedString = "";
        for(int i=0;i<testString.length();i++)
        {

            if(testString.charAt(i)=='a')
            {
                modifiedString+="$";
            }
            else
                modifiedString+=testString.charAt(i);
        }
        testString=modifiedString;
        System.out.println(testString);
    }
}
