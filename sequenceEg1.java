package com.javaAssignment;

import java.util.Scanner;

// To print Sequence 4, 16, 36, 64.......
public class sequenceEg1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many terms wanted in sequence : ");
        int  seqNo = sc.nextInt();
        for(int i=2;i<=seqNo*2;i+=2)
        {
            int result=i*i;
            System.out.print(result+" ");
        }
    }
}
