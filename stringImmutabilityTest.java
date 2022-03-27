package com.javaAssignment;

public class stringImmutabilityTest
{
    public static void main(String[] args)
    {
        String testVariable = "String";    //String type testVariable
        System.out.println(testVariable);
        testVariable.concat("Assignment 1");   //Concatenation operation performed
        System.out.println(testVariable);

    }
}
//Output = String
//         String
//After the concatenation operation, the testVariable still prints the value "String".
//This shows that string type variable once assigned a value cannot change, ie is immutable