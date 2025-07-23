
public class student extends person {

    protected int sem;

    public student(String name, int age, int sem) {
        super(name, age);
        this.sem = sem;
    }

    @Override
    public void getDetails() {
        System.out.println("--------");
        System.out.println("From student...");
        System.out.println("Name : " + name + " Age : " + age + " Sem : " + sem);
    }
}
