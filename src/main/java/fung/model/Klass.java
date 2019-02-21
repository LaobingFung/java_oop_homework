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
        if (isIn(stu)) {
            this.leader = stu;
        } else {
            System.out.println("It is not one of us");
        }
    }

    public boolean isIn(Student stu) {
        return stu.getKlass().getNumber() == this.number;
    }

    public void appendMember(Student stu) {
        stu.setKlass(this);
    }
}
