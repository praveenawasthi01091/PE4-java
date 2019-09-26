package com.stackroute.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        String inputString;
        Scanner sc= new Scanner(System.in);
        System.out.print("Input String:  ");
        inputString=sc.nextLine();
        String []stringArray=inputString.split("\\s");
        List<StringBuilder> list=new ArrayList<>();
        for(int i=0;i<stringArray.length;i++)
        {
            StringBuilder sb=new StringBuilder(stringArray[i]);
            sb.reverse();
            list.add(sb);
        }
        //System.out.println(list);
        System.out.print("Output String: ");
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+"  ");
        }
    }
}
