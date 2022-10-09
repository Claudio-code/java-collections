package org.java.collections.CollectionsRelationships;

import org.java.collections.Sets.Student;
import org.java.collections.arraylist.Classroom;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Course {

    private final String name;
    private final String instructor;
    private final List<Classroom> classrooms = new LinkedList<>();
    private final Set<Student> students = new HashSet<>();
    
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


    public Set<Student> getStudents() {
        return Collections.unmodifiableSet(students);
    }

    public void enrollStudent(final Student student) {
        students.add(student);
    }

    public void enrollAllStudent(final List<Student> studentsToAdd) {
        students.addAll(studentsToAdd);
    }

}
