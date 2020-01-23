package Study_center.Person;

import Study_center.Program;

public class Student extends Person {

    private Program studentsProgram;

    public Student(String name, String surName) {
        super(name, surName);
    }

    public Program getStudentsProgram() {
        return studentsProgram;
    }

    public void setStudentsProgram(Program studentsProgram) {
        this.studentsProgram = studentsProgram;
    }
}
