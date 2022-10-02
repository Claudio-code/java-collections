package org.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain {
    public static void main(String[] args) {
        String classroom1 = "lua1";
        String classroom2 = "lua2";
        String classroom3 = "lua3";
        String classroom4 = "a lua5";

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(classroom1);
        arrayList.add(classroom3);
        arrayList.add(classroom2);
        arrayList.add(classroom4);

        // order list
        Collections.sort(arrayList);
        
        arrayList.forEach(
            classroom -> System.out.println("My classroom: " + classroom)
        );
    }
}
