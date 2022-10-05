package org.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Comparator.comparing;

public class ArrayListMain {
    public static void main(String[] args) {
        exampleWithString();
        exampleWithClass();
    }

    private static void exampleWithClass() {
        final var classroom1 = new Classroom("math", 33);
        final var classroom2 = new Classroom("geo", 54);
        final var classroom4 = new Classroom("art", 41);
        final var classroom5 = new Classroom("phisical", 10);
        final var arrayList = new ArrayList<Classroom>();
        arrayList.add(classroom1);
        arrayList.add(classroom5);
        arrayList.add(classroom2);
        arrayList.add(classroom4);
    
        Collections.sort(arrayList, comparing(Classroom::getTimeMinutes));
        System.out.println(arrayList);
    }

    private static void exampleWithString() {
        final String classroom1 = "lua1";
        final String classroom2 = "lua2";
        final String classroom3 = "lua3";
        final  String classroom4 = "a lua5";

        final var arrayList = new ArrayList<String>();
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
