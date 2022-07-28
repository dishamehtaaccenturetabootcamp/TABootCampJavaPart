package com.bootcampexcercise.module8.sample;
// Complete Code


import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapSample {

    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("1", "A String");
        map.put("2", new Date());
        map.put("3", 42);
        map.put("4", 23.0f);
        map.put("myName", "Arturs");

        System.out.println("Map 1 value initially: " + map.get("1"));
        //Beware of using the same key twice cause it will overwrite the value
        map.put("1", "Same key as A String");

        System.out.println("Map 1 value after updating key value: " + map.get("1"));

        System.out.println("Some random stuff printing");
        System.out.println(map.get("2"));
        System.out.println(map.get("myName"));

        print(map);

    }

    static void print(Map map) {
        //Keys are maintained as set in map.
        Set keySet = map.keySet();

        //You can use an iterator to access keys
        System.out.println("*************************************");
        System.out.println("Key\tValue");
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key + "\t" + map.get(key));
        }

        System.out.println("*************************************");

    }
}