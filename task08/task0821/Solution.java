package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map< String,String> map = new HashMap<String, String>();
        map.put("Alex","Coziosko");
        map.put("Kate","Readdy");
        map.put("Darren","Parker");
        map.put("Alex","Matte");
        map.put("Matt","Shannon");
        map.put("Peter","Parker");
        map.put("Iryna","Fedorova");
        map.put("Darren","Costino");
        map.put("Brandley","Readdy");
        map.put("Matt","Murphy");


        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
