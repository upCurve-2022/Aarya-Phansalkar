package com.javaAssignment;
import java.util.Scanner;

public class averageOfArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of required array : ");
        int arrayLength = sc.nextInt();
        double arrayAverage =0;
        int [] array = new int[arrayLength];
        System.out.print("Enter array elements : ");
        for(int i=0;i<array.length;i++)
        {
           array[i] = sc.nextInt();
           arrayAverage+= array[i];
        }
        System.out.print(arrayAverage/array.length);
    }
}
