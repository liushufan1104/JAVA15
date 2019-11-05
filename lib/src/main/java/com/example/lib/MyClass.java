package com.example.lib;
import java.util.Scanner;
public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter time(he:min:sec)");
        String s = scanner.next();
        String HR,MIN;
        int hr,min;
        int F =s.indexOf(":");
        int E = s.lastIndexOf(":");
        HR = s.substring(0,F);
        MIN = s.substring(F+1,E);
        hr=Integer.parseInt(HR);
        min=Integer.parseInt(MIN);
        int total =hr*60+min;
        if(total>=450&&total<1020){
            System.out.println("it's class time ");
        }
        else {
            System.out.println("it's After class time");
        }
    }
}