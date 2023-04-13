package exercise2;

public class ClassroomMain {
    public static void main (String [] args) {

        Classroom classroom = new Classroom();

        Student student1 = new Student("Lejla");
        Student student2 = new Student("Matt Duffer", 39);

        classroom.addStudent(student1);
        classroom.addStudent(student2);

        System.out.println("Student is present: " + classroom.isPresent("Matt Duffer"));
        System.out.println("Student is present: " + classroom.isPresent("Joe"));

        classroom.printClassroom();
    }
}
