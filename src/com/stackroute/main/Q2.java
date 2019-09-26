package com.stackroute.main;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String inputString=sc.nextLine();
		sc.close();
		
		/* method call*/
		String outputString=replaceCharacters(inputString);
		System.out.println("Original String: "+outputString);
		System.out.println("New String: "+outputString);
		

	}
	public  static  String replaceCharacters(String inputString) {
	String outputString=inputString.replace("d", "f");
	 outputString=outputString.replace("l", "t");
	 return outputString;
	}

}
