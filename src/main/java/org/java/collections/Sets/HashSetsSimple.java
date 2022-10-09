package org.java.collections.Sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetsSimple {

    public static void main(String[] args) {
        final Set<String> students = new HashSet<>();
        students.add("marcio");
        students.add("rayane");
        students.add("cleberson");
        students.add("alexandro");
        students.add("marcio");

        students.forEach(System.out::println);
        System.out.println(students.size());
    }

}
