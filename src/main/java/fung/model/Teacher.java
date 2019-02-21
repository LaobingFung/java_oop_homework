package main.java.fung.model;

public class Teacher extends Person {
    private Klass[] klasses;

    public Teacher(int id, String name, int age, Klass[] klasses) {
        super(id, name, age);
        this.klasses = klasses;
    }

    public boolean isTeaching(Student stu) {
        for (Klass klass: klasses) {
            if (klass.isIn(stu)) {
                return true;
            }
        }
        return false;
    }

    public void appendInformed(Student stu) {
        String strOut = "I am " + getName() + ". I know" + stu.getName() + "has joined Class " + stu.getKlass().getNumber() + ".";
        System.out.println(strOut);
    }

    @Override
    public String introduce() {
        String introStr = null;
        if (this.klasses.length == 0) {
            introStr = "I teach No Class.";
        } else {
            introStr = "I teach Class";
            for (int i = 0; i < klasses.length; i++) {
                introStr += klasses[i].getNumber();
                if (i < klasses.length - 1) {
                    introStr += ", ";
                }
            }
        }
        return super.introduce() + "I am a Teacher." + introStr;
    }
}
