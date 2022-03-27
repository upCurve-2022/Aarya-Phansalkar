package com.javaAssignment;

import java.util.Scanner;

public class sequenceEg2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many terms wanted in sequence : ");
        int  seqNo = sc.nextInt();
        int [] seqArray = new int[seqNo];
        int i=-1;
        int k=2;
        for(int j=0;j<seqNo;j++)
        {
          if(j%2==0)
          {
              seqArray[j]= i;
              i-=2;
          }
          else
          {
              seqArray[j]=k;
              k+=2;
          }
        }
        for(int j=0;j<seqNo;j++)
        {
            System.out.print(" "+seqArray[j]);
        }

    }
}
