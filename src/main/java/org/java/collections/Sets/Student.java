package org.java.collections.Sets;

public class Student implements Comparable<Student> {

    private final String name;
    private final Integer enroll;
    private final Integer yearsOlder;

    public Student(String name, int enroll, Integer yearsOlder) {
        this.name = name;
        this.enroll = enroll;
        this.yearsOlder = yearsOlder;
    }

    public String getName() {
        return name;
    }

    public Integer getEnroll() {
        return enroll;
    }

    public Integer getYearsOlder() {
        return yearsOlder;
    }

    @Override
    public String toString() {
        return "[Student: " + name + ", enroll: " + enroll + ", hascode: " + hashCode() + "]";
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Student) {
            final var student = (Student) object;
            return name.equals(student.getName()) && enroll.equals(student.getEnroll());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + enroll.hashCode();
    }

    @Override
    public int compareTo(Student student) {
        return yearsOlder.compareTo(student.getYearsOlder());
    }

}
