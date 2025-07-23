
public class university {

    public static void main(String[] args) {
        person pobj = new person("Dhruv", 18);
        student sobj = new student("Het", 20, 8);
        teacher tobj = new teacher("SIR", 35, "Java");

        pobj.getDetails();
        sobj.getDetails();
        tobj.getDetails();

        // person upcastStudent = new student("Upcast", 55, 5);
        // if (upcastStudent instanceof student) {
        //     student s1 = (student)upcastStudent;
        //     s1.getDetails();
        // }
        
        person upcastStudent = new student("Upcast", 55, 5);
        if (upcastStudent instanceof student s1) {
            s1.getDetails();
        }
        System.out.println("--------");

        // Find out possible ways to communicate between student and teacher
        // E.g. : Student var should be accessed by Teacher and vice versa
    }
}
