package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter number 1 : ");
	double m=sc.nextDouble();
	System.out.print("Enter number 1 : ");
	double n=sc.nextDouble();
	double a=n*m;
	if(a>0){
		System.out.print(" + ");
	}
	else if(a<0){
		System.out.print(" - ");
	}
	else{
			System.out.print(" 0 ");
		}

    }
}
