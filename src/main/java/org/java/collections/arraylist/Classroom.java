package org.java.collections.arraylist;

public class Classroom implements Comparable<Classroom> {

    private final String name;
    private final int timeMinutes;

    public Classroom(final String name, final int timeMinutes) {
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
    public int compareTo(final Classroom otherClassroom) {
        return name.compareTo(otherClassroom.getName());
    }

    @Override
    public String toString() {
        return "[Classroom: " + name + ", time in minutes: " + timeMinutes + "]";
    }

}
