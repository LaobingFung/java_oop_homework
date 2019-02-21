package main.java.fung.model;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public Student getLeader() {
        return this.leader;
    }

    public void assignLeader(Student stu) {
        if (stu.getKlass().equals(this)) {
            this.leader = stu;
        } else {
            System.out.println("It is not one of us");
        }
    }

    public void appendMember(Student stu) {
        stu.setKlass(this);
    }
}
