import java.util.PriorityQueue;
import java.util.Comparator;

class Task {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String toString() {
        return "Task - " + name + ", Priority - " + priority;
    }
}

public class PriorityScheduler {
    public static void main(String[] args) {
        Comparator<Task> priorityComparator = new Comparator<Task>() {
            @Override
            public int compare(Task task1, Task task2) {
                return Integer.compare(task1.priority, task2.priority);
            }
        };

        PriorityQueue<Task> taskQueue = new PriorityQueue<>(priorityComparator);
        taskQueue.offer(new Task("Clean the house", 3));
        taskQueue.offer(new Task("Go to the post office", 2));
        taskQueue.offer(new Task("Cook food", 4));
        taskQueue.offer(new Task("Work on a project", 5));
        taskQueue.offer(new Task("Submit the report", 1));
        taskQueue.offer(new Task("Check messages", 6));

        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println(task);
        }
    }
}
