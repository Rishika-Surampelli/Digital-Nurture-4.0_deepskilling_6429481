package taskmanagement;

public class TaskManager {
    private TaskNode head;

    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Task added: " + task);
    }

    public void searchTask(String taskId) {
        TaskNode temp = head;
        while (temp != null) {
            if (temp.task.getTaskId().equals(taskId)) {
                System.out.println("Task found: " + temp.task);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Task not found with ID: " + taskId);
    }

    public void deleteTask(String taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            System.out.println("Task deleted with ID: " + taskId);
            return;
        }

        TaskNode temp = head;
        while (temp.next != null) {
            if (temp.next.task.getTaskId().equals(taskId)) {
                temp.next = temp.next.next;
                System.out.println("Task deleted with ID: " + taskId);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Task not found with ID: " + taskId);
    }

    public void viewTasks() {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }

        TaskNode temp = head;
        System.out.println("All Tasks:");
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }
}
