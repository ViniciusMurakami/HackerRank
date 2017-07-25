package com.hackerrank.daysofcode;
import java.util.*;
/**
 * Created by vmurakami on 24/07/17.
 */
public class DictionariesMaps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(map.containsKey(s)){
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
