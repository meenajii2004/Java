package Hashmapss;

import java.util.*;

public class basicHash {
    
    public static void HashMapMethod(){
        Map<String , Integer> mp = new HashMap<>();
        mp.put("rajesh", 21);
        mp.put("ramesh", 20);
        mp.put("kallu", 90);
        mp.put("harry", 35);
        
        // System.out.println(mp.get("rajesh"));
        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d \n" , key , mp.get(key));
        }

        System.out.println();
        
        for(var key : mp.keySet()){
            System.out.printf("Age of %s is %d \n" , key , mp.get(key));
        }
    }

    public static void main(String[] args) {
        HashMapMethod();
    }
}
