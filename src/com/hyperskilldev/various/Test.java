package com.hyperskilldev.various;

public class Test {

    public static void main(String args[]) {

        Person person = new Person("R. Johnson");

        System.out.println(Person.getNextId()); // (1)
    }
}

class Person {

    private static long nextId = 1;

    long id;
    String name;

    public Person(String name) {
        this.name = name;
        this.id = nextId;
        nextId++; // (2)
    }

    public static long getNextId() { // (3)
        return nextId;
    }
}
