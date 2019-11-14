/**
 * Task
 */
public class Task extends Todo {
    String description;
    int priority;
    int minutes;

    public Task (String description, int priority, int minutes) {
        this.description = description;
        this. priority = priority;
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return description + " takes " + minutes + " minutes and has priority " + getPriority();
    }

    public String getPriority() {
    String priorityString = " ";
    switch (priority) {
        case 1:
        priorityString = "very important";
            break;
        case 2:
        priorityString = "important";
            break;
        case 3:
        priorityString = "unimportant";
            break;
        case 4:
        priorityString = "after learn Portuguese";
            break;
    }
    return priorityString;
    }




}