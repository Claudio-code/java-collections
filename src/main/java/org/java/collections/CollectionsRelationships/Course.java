package org.java.collections.CollectionsRelationships;

import org.java.collections.arraylist.Classroom;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Course {

    private final String name;
    private final String instructor;
    private final List<Classroom> classrooms = new LinkedList<>();
    
    public Course(final String name, final String instructor) {
        this.name = name;
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getCourseTime() {
        return classrooms.stream()
            .mapToInt(Classroom::getTimeMinutes)
            .sum();
    }

    public List<Classroom> getClassrooms() {
        return Collections.unmodifiableList(classrooms);
    }

    public void addClassroom(final Classroom classroom) {
        classrooms.add(classroom);
    }

    public void addClassrooms(final List<Classroom> classroomsToAdd) {
        classrooms.addAll(classroomsToAdd);
    }

    public void print() {
        classrooms.forEach(System.out::println);
    }

}
