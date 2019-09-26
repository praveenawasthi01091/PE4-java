package com.stackroute.main;
import java.util.*;;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String: ");
		String inputString=sc.nextLine();
		System.out.print("Enter Character: ");
		String inputCharacter=sc.nextLine();
		sc.close();
		//System.out.println(inputString.length());
	//	inputString=inputString.replace(" ", "");
		//System.out.println(inputString.length());
		int len=inputString.length();
		String outputString=inputString.replace(inputCharacter, "");
		int lenAfterRemovingCharacter=outputString.length();
		//System.out.println(lenAfterRemovingCharacter);
		System.out.println(len-lenAfterRemovingCharacter);

	}

}
