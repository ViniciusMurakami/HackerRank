package com.hackerrank.daysofcode;
import java.io.*;
import java.util.*;
/**
 * Created by vmurakami on 23/07/17.
 */
public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        StringBuilder x = new StringBuilder();
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        for(int y = arr.length - 1; y >=0; y--){
            x.append(arr[y]);
            if(y != 0){
                x.append(" ");
            }
        }
        System.out.println(x);

    }
}
