package com.acadglid.java.core.session2.assignment2;

import java.util.Scanner;

public class PrimeNumbers {
	
	private static Scanner s;

	static boolean findPrimeNumber(int number){
		boolean prime=true;
		for(int i=2; i<=number/2;i++){
			if(number%i == 0){
				prime=false;
				break;
			}
		}
		return prime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		s = new Scanner(System.in);
		System.out.println("Enter the Range to find the prime number");
		System.out.println("enter the starting of range");
	    int initial=s.nextInt();
		System.out.println("Enter the Range limit");
		int limit =s.nextInt();
		System.out.print("Prime numbers are");
		for(int i=initial; i<=limit;i++){
			if (findPrimeNumber(i)){
			System.out.print(" "+i);	
			}
		}
		

	}

}
