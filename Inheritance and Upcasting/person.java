
public class person {

    protected String name;
    protected int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getDetails() {
        System.out.println("--------");
        System.out.println("From person...");
        System.out.println("Name : " + name + " Age : " + age);
    }
}
