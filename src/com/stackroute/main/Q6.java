package com.stackroute.main;

import java.util.Scanner;
import java.util.regex.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String inputString,inputStringToSearch;
        System.out.println("Enter String:");
        inputString=sc.nextLine();

        System.out.println("Enter String  to search:");
        inputStringToSearch=sc.nextLine();


        /* use matcher */
        //Pattern pattern =Pattern.compile(inputStringToSearch);
        Pattern pattern=Pattern.compile(inputStringToSearch);
        Matcher  matcher=pattern.matcher(inputString);

        while(matcher.find())
        {
            System.out.println("Found at: "+matcher.start()+" - " + matcher.end());
        }

    }
}
