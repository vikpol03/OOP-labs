package Lab_3;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Lab_3_TASK1 {

    enum Status {
        TO_DO, IN_PROGRESS, COMPLETED, CANCELLED
    }

    class TaskItem {
        private int taskId;
        private String taskDescription;
        private Status taskStatus;

        public TaskItem(int taskId, String taskDescription, Status taskStatus) {
            this.taskId = taskId;
            this.taskDescription = taskDescription;
            this.taskStatus = taskStatus;
        }

        public int getTaskId() {
            return taskId;
        }

        public String getTaskDescription() {
            return taskDescription;
        }

        public Status getTaskStatus() {
            return taskStatus;
        }
    }

    public class DataStructures {
        private List<TaskItem> tasks = new ArrayList<>();

        public DataStructures() {
            tasks.add(new TaskItem(1, "Push lab code to the github", Status.TO_DO));
            tasks.add(new TaskItem(2, "Prepare for the quiz", Status.IN_PROGRESS));
            tasks.add(new TaskItem(3, "Go over tasks from lab2", Status.COMPLETED));
        }

        public List<TaskItem> getAllTasks() {
            return tasks;
        }

        public List<TaskItem> getByStatus(Status status) {
            return tasks.stream()
                    .filter(task -> task.getTaskStatus() == status)
                    .collect(Collectors.toList());
        }

        public List<TaskItem> getTasksWithIdGreaterThanOrEqualTo(int id) {
            return tasks.stream()
                    .filter(task -> task.getTaskId() >= id)
                    .collect(Collectors.toList());
        }

        public void printTaskDescriptions() {
            tasks.forEach(task -> System.out.println(task.getTaskDescription()));
        }

        public void main(String[] args) {
            DataStructures dataStructures = new DataStructures();

            System.out.println("All Tasks:");
            dataStructures.printTaskDescriptions();

            System.out.println("\nTasks in Progress:");
            List<TaskItem> inProgressTasks = dataStructures.getByStatus(Status.IN_PROGRESS);
            inProgressTasks.forEach(task -> System.out.println(task.getTaskDescription()));

            System.out.println("\nTasks with ID >= 2:");
            List<TaskItem> tasksWithIdGreaterOrEqual2 = dataStructures.getTasksWithIdGreaterThanOrEqualTo(2);
            tasksWithIdGreaterOrEqual2.forEach(task -> System.out.println(task.getTaskDescription()));
        }
    }

}