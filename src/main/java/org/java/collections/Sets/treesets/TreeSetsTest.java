package org.java.collections.Sets.treesets;

import org.java.collections.Sets.Student;

import java.util.TreeSet;

public class TreeSetsTest {

    public static void main(String[] args) {
        TreeSet<Student> course = new TreeSet<>();
        course.add(new Student("ana", 231, 22));
        course.add(new Student("marcio", 9211, 23));
        course.add(new Student("edson", 6431, 82));
        course.add(new Student("casa", 241, 15));

        System.out.println(course);
    }

}
