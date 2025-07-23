
public class teacher extends person {

    protected String sub;

    public teacher(String name, int age, String sub) {
        super(name, age);
        this.sub = sub;
    }

    @Override
    public void getDetails() {
        System.out.println("--------");
        System.out.println("From teacher...");
        System.out.println("Name : " + name + " Age : " + age + " Subject : " + sub);
    }
}
