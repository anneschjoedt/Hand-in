import java.util.ArrayList;

/**
 * Todo
 */
public class Todo {

    ArrayList<Task> tasks;
    //int totalWorkload;

    public Todo() {
        tasks = new ArrayList<>();
        int totalWorkload = 0;
    }

    public void addTask(String description, int priority, int minutes) {
        if (priority > 4 || priority < 1) {
            System.out.println(description + " has invalid priority");
        } else if (minutes < 1) {
            System.out.println(description + " has invalid workload");
        } else {
            tasks.add(new Task(description, priority, minutes));
        }
    }

    public void print() {
        if (tasks.isEmpty()) {
            System.out.println("You're all done for today! #TodoZero");
            System.out.println(totalWorkload);
        } else {
            System.out.println("Todo:  \n-----");
            tasks.forEach(task -> System.out.println(task));
            // for (Task task : toDoList) {
            //     System.out.println(task);
            if (totalWorkload > 0) {
                System.out.println(totalWorkload + " minutes of work done!");
            }
            }
        }

    public void completeTask(int index) {
        try {
            totalWorkload += tasks.getMinutes(index);
            tasks.remove(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }

    public int getMinutes() {
        return minutes; 
    }

    printPriority(int limit) {
        
    }
}