package Tugas;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Course model = retriveStudentFromDatabase();
        CourseView view = new CourseView();
        CourseController controller = new CourseController(model, view);
        controller.updateView();
        System.out.println("Tampilan setelah diupdate");
        controller.setCourseName("Python");
        controller.setCourseId("01");
        controller.setCourseCategory("Programming");
        controller.updateView();
    }

    private static Course retriveStudentFromDatabase() {
        Course course = new Course();
        course.setName("Java");
        course.setId("01");
        course.setCategory("Programming");
        return course;
    }
}
