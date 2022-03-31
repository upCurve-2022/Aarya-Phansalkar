package com.javaAssignment;

import java.util.Scanner;

public class fibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many terms wanted in sequence : ");
        int  seqNo = sc.nextInt();
        int [] fibonacciSeq = new int[seqNo];
        fibonacciSeq[0] = 1;
        fibonacciSeq[1] = 1;
        for(int i=2;i<seqNo;i++)
        {
            fibonacciSeq[i]=fibonacciSeq[i-1]+fibonacciSeq[i-2];
        }
        for(int i=0;i<seqNo;i++)
        {
            System.out.print(" "+fibonacciSeq[i]);
        }

    }
}
