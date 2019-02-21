import main.java.fung.model.Klass;
import main.java.fung.model.Person;
import main.java.fung.model.Student;

public class Main {
    public static void main(String[] args) {
        Klass klass2 = new Klass(2);
        Student tom = new Student(20190101, "Tom", 21, klass2);
        System.out.println(tom.introduce());
    }
}
