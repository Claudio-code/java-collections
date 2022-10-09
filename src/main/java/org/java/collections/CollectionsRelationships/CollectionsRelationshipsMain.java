package org.java.collections.CollectionsRelationships;

import org.java.collections.arraylist.Classroom;

import java.util.List;

public class CollectionsRelationshipsMain {
    
    public static void main(String[] args) {
        final var course = new Course("another course", "teacher");
        course.addClassrooms(List.of(
            new Classroom("math", 10),
            new Classroom("geography", 50)
        ));
        
        course.print();
        System.out.println(course.getCourseTime());
    }

}
