package Latihan;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setTitle("Sistem Multimedia");

        Student s1 = new Student("Ricky Gunaldo ");
        Student s2 = new Student("Ammar Bagas ");
        Student s3 = new Student("Aji Kartiko ");

        CourseRecord cr1 = new CourseRecord();
        cr1.setStudent(s1);
        cr1.addAssignment(new Assignment(80));
        cr1.addAssignment(new Assignment(90));
        cr1.addAssignment(new Assignment( 70));

        CourseRecord cr2 = new CourseRecord();
        cr2.setStudent(s2);
        cr2.addAssignment(new Assignment(40));
        cr2.addAssignment(new Assignment(50));
        cr2.addAssignment(new Assignment(45));

        CourseRecord cr3 = new CourseRecord();
        cr3.setStudent(s3);

        course.addCourseRecord(cr1);
        course.addCourseRecord(cr2);
        course.addCourseRecord(cr3);

        course.printCourseStudents();
        System.out.println();
        course.printBestStudent();
        System.out.println();
        course.printFinalExamStudents();
    }
}