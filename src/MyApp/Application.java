package MyApp;

class Student{

    public static final int MY_CONSTANT = 8;
    public String name;
    public static String studentClass;

    public void studentName(){
        System.out.println(name);
    }

    public static void classInfo(){
        System.out.println("Java");
    }
}
public class Application {
    public static void main(String[] args) {

        Student.studentClass = "Web Development Fundamentals";
        System.out.println(Student.studentClass);

        Student student = new Student();
        Student student2 = new Student();

        student.name = "Steven";
        student2.name = "Daniel";

        System.out.println(student.name);
        System.out.println(student2.name);

        student.studentName();
        student2.studentName();

        Student.classInfo();

        System.out.println(Student.MY_CONSTANT);

    }
}
