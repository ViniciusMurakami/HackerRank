package com.hackerrank.daysofcode;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by vmurakami on 23/07/17.
 */
public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(n + " " + "x " + i + " = " + (i*n)) ;
        }
    }
}
