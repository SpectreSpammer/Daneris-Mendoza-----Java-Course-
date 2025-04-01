package com.onepieceofjava.day10_collections_framework;

import java.util.*;

public class CollectionOrderDemo {
    public static void main(String[] args) {

        List<Integer> numbersFrom1To10 = Arrays.asList(2,4,6,1,3,5,8,10,7,9);
        System.out.println("Printing original numbers" + numbersFrom1To10);
        System.out.println();

        //HashMap
        Map<Integer,String> hashMap = new HashMap<>();
        for(int num : numbersFrom1To10){
           hashMap.put(num,", Value: " + num);
        }
        System.out.println("Hashmap: " + hashMap);
        System.out.println();

        //TreeMap
        Map<Integer,String> treeMap = new TreeMap<>();
        for(int num : numbersFrom1To10){
            treeMap.put(num, ", Value: " + num);
        }
        System.out.println("Treemap: " + treeMap);
        System.out.println();

        //HashSet
        Set<Integer> hashSet = new HashSet<>(numbersFrom1To10);
        System.out.println("HashSet: " + hashSet);
        System.out.println();

        //TreeSet
        Set<Integer> treeSet = new TreeSet<>(numbersFrom1To10);
        System.out.println("TreeSet: " + treeSet);
        System.out.println();

        //ArrayList
        List<Integer> arrayList = new ArrayList<>(numbersFrom1To10);
        System.out.println("ArrayList: " + arrayList);
        System.out.println();

        //LinkedList
        List<Integer> linkedList = new LinkedList<>(numbersFrom1To10);
        System.out.println("LinkedList: " + linkedList);
        System.out.println();

        Collections.shuffle(numbersFrom1To10);
        System.out.println("Shuffling the numbers from the list: " + numbersFrom1To10);
        System.out.println();






    }
}
