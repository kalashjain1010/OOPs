public class App {
    public static void main(String[] args) throws Exception {
        student student1 = new student();
        student1.roll =23;
        student1.name= "bake";

        System.out.println(student1.name);
    }
}

class student{
    int roll;
    String name;
    int marks;
}