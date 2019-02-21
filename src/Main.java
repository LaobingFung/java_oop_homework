import main.java.fung.model.Klass;
import main.java.fung.model.Person;
import main.java.fung.model.Student;
import main.java.fung.model.Teacher;

public class Main {
    public static void main(String[] args) {
        Klass klass2 = new Klass(2);
        Klass klass1 = new Klass(1);
        Klass klass3 = new Klass(3);
        Student tom = new Student(20190101, "Tom", 21, klass2);
        Student han = new Student(20190303, "Han", 21, klass3);
        klass1.assignLeader(tom);
        System.out.println(tom.introduce());
        Teacher jason = new Teacher(2019001, "Jason", 40, new Klass[]{klass1, klass2});
        System.out.println(jason.introduce());
        System.out.println(jason.isTeaching(tom));
        System.out.println(jason.isTeaching(han));
    }
}
