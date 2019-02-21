package main.java.fung.model;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String introStr = this.klass.getLeader().getId() == super.getId()? ("I am Leader of Class " + this.klass.getNumber() + ".") : ("I am at Class " + this.klass.getNumber() + ".");
        return super.introduce() + introStr;
    }
}
