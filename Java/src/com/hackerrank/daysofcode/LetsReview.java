package com.hackerrank.daysofcode;
import java.io.*;
import java.util.*;
/**
 * Created by vmurakami on 23/07/17.
 */
public class LetsReview {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int qty_words = scan.nextInt();
        while (qty_words > 0) {
            String word = scan.next();

            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                if (i % 2 == 0 || i == 0) {
                    even.append(word.charAt(i));
                } else {
                    odd.append(word.charAt(i));
                }
            }
            qty_words--;
            System.out.println(even.toString() + " " + odd.toString());
        }
    }
}
