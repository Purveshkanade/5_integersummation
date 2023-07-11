package com.abstarct;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number=");
        int a = sc.nextInt();
        System.out.print("Enter second number=");
        int b = sc.nextInt();
        System.out.print("Enter third number=");
        int c = sc.nextInt();
        System.out.print("Enter fourth number=");
        int d = sc.nextInt();
        System.out.print("Enter fifth number=");
        int e = sc.nextInt();

        int f = a+b+c+d+e;

        System.out.println("Summation=" +f);




    }
}
