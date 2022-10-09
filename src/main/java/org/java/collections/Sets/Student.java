package org.java.collections.Sets;

public class Student {

    private final String name;
    private final Integer enroll;

    public Student(String name, int enroll) {
        this.name = name;
        this.enroll = enroll;
    }

    public String getName() {
        return name;
    }

    public Integer getEnroll() {
        return enroll;
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

}
