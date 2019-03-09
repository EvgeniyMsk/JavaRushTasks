package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String,Cat> map=new HashMap<String, Cat>();
        for (int i=0;i<10; i++){
            map.put("name"+Integer.toString(i), new Cat("name"+Integer.toString(i)));
        }
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set=new HashSet<Cat>();
        Iterator<Map.Entry<String,Cat>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Cat> pair = iterator.next();
            String key = pair.getKey();            //ключ
            Cat value = pair.getValue();        //значение
            set.add(value);
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
