package com.hackerrank.daysofcode;
import java.io.*;
import java.util.*;

public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        String binary =  Integer.toString(input,2);
        int set = 0, max = 0;
        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '1'){
                set++;
                if(max < set){
                    max = set;
                }
            } else {
                set = 0;
                continue;
            }
        }
        System.out.println(max);
    }
}

