package com.hackerrank.daysofcode;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by vmurakami on 25/07/17.
 */
public class Recursion {

    static int factorial(int n) {
        if(n == 1){
            return n;
        } else {
            return n * factorial(n - 1) ;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
