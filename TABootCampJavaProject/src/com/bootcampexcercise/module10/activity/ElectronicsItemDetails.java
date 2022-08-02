package com.bootcampexcercise.module10.activity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author disha.k.mehta
 * Activity 5
 */
public class ElectronicsItemDetails {

    public static void main(String args[]) {

        Map itemHashMap = new HashMap();
        itemHashMap.put("TV", "5699");
        itemHashMap.put("Laptop", "56789");
        itemHashMap.put("Refrigerator", "57352");
        itemHashMap.put("Washing Machine", "457");

        System.out.println("Price of TV is " + returnPriceOfItem(itemHashMap, "TV"));

    }

    public static String returnPriceOfItem(Map itemHashMap, String item) {

        return itemHashMap.get("TV").toString();
    }
}

// Output
// Price of TV is 5699
