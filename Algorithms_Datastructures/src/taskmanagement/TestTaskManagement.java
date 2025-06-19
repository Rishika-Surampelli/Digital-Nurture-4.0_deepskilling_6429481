package taskmanagement;

public class TestTaskManagement {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task("T001", "Design UI", "Pending"));
        manager.addTask(new Task("T002", "Develop Backend", "In Progress"));
        manager.addTask(new Task("T003", "Write Documentation", "Not Started"));

        System.out.println("\n-- Viewing All Tasks --");
        manager.viewTasks();

        System.out.println("\n-- Searching Task T002 --");
        manager.searchTask("T002");

        System.out.println("\n-- Deleting Task T001 --");
        manager.deleteTask("T001");

        System.out.println("\n-- Final Task List --");
        manager.viewTasks();
    }
}
