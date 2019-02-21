import main.java.fung.model.Person;

public class Main {
    public static void main(String[] args) {
        Person tom = new Person(20190101, "Tom", 21);
        System.out.println(tom.introduce());
    }
}
