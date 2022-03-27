package com.javaAssignment;
import java.util.Scanner;

public class sequenceEg3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many terms wanted in sequence : ");
        int  seqNo = sc.nextInt();
        int [] seqArray = new int[seqNo];
        for(int i=0;i<seqNo;i++)
        {
           seqArray[i] = (int) Math.pow(i+1,i+1);
        }
        for(int i=0;i<seqNo;i++)
        {
            System.out.print(" "+seqArray[i]);
        }
    }
}
