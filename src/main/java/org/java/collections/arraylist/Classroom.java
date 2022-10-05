package org.java.collections.arraylist;

public class Classroom implements Comparable<Classroom> {

    private String name;
    private int timeMinutes;

    public Classroom(String name, int timeMinutes) {
        this.name = name;
        this.timeMinutes = timeMinutes;
    }

    public String getName() {
        return name;
    }

    public int getTimeMinutes() {
        return timeMinutes;
    }

    @Override
    public int compareTo(Classroom otherClassroom) {
        return name.compareTo(otherClassroom.getName());
    }

    @Override
    public String toString() {
        return "[Classroom: " + name + ", time in minutes: " + timeMinutes + "]";
    }
    
}
