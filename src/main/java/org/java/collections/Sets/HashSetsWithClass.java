package org.java.collections.Sets;

import org.java.collections.CollectionsRelationships.Course;
import org.java.collections.arraylist.Classroom;

import java.util.List;

public class HashSetsWithClass {

    public static void main(String[] args) {
        final var course = new Course("another course", "teacher");
        course.addClassrooms(List.of(
            new Classroom("math", 10),
            new Classroom("geography", 50)
        ));
        course.enrollStudent(new Student("ana", 231, 22));
        course.enrollStudent(new Student("marcio", 9211, 23));
        course.enrollStudent(new Student("edson", 6431, 12));
        course.enrollStudent(new Student("casa", 241, 45));

        final var hasStudent = course
                .getStudents()
                .contains(new Student("ana", 231, 22));

        System.out.println();
        System.out.println("has ana in course: " + hasStudent);
        System.out.println(course.getStudents());
        System.out.println(course.getStudents().size());
    }

}
