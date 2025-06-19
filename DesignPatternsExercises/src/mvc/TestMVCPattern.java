package mvc;

public class TestMVCPattern {
    public static void main(String[] args) {
        // Create model
        Student student = new Student("Riya Sharma", "S101", "A");

        // Create view
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Display initial student info
        controller.updateView();

        System.out.println("\nUpdating student grade to A+...\n");

        // Update student data
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}
