package com.javaAssignment;
import java.util.Scanner;

public class cylinderVolume
{
    void calculateVolume(double radius, double height)
    {
        final double pi = 3.14;
        double volume = pi*radius*radius*height;
        System.out.println("Volume of cylinder is : "+volume);
    }

    public static void main(String[] args)
    {
        cylinderVolume newObj = new cylinderVolume();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius : ");
        double cylinderRadius = sc.nextDouble();
        System.out.println("Enter height : ");
        double cylinderHeight = sc.nextDouble();
        newObj.calculateVolume(cylinderRadius,cylinderHeight);
    }
}
