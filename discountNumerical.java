package com.javaAssignment;
import java.util.Scanner;

public class discountNumerical
{
    public static void main(String[] args)
    {
        final double costOfPen = 50;
        final double discount = 0.12;
        double sellingPrice = costOfPen - (discount*costOfPen);
        System.out.println("Discount amount is :"+(costOfPen*discount)+"$\nSelling price of pen is :"+sellingPrice+"$");
    }
}
