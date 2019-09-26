package com.stackroute.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString;
		Scanner sc= new Scanner(System.in);
		System.out.print("Input String: ");
		inputString=sc.nextLine();
		String []stringArray=inputString.split("[\\s , ? !]");
		String tempString;
		//List<String>list=new ArrayList<>();
		/* sort */
		for (int i=0;i<stringArray.length;i++)
		{
			for (int j=0;j<stringArray.length;j++)
			{
				if (stringArray[i].compareTo(stringArray[j])<=0)
				{
					tempString = stringArray[i];
					stringArray[i] = stringArray[j];
					stringArray[j] = tempString;
				}

			}
		}
		System.out.println();
		System.out.print("Sorted Order: ");
		for(int i=0;i<stringArray.length;i++)
		{
			System.out.print(stringArray[i]+" ");
		}

	}

}
