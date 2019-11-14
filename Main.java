/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        //Task task1 = new Task("Java", 1, 60);
        //System.out.println(task1.toString());
        Todo todo1 = new Todo();
        todo1.addTask("Java", 1, 60);
        todo1.addTask("Danse", 1, 10);
        todo1.addTask("Læse matematik", 4, 120);
        todo1.addTask("Pynte op til jul", 1, 30);
        todo1.addTask("Se juleTV", 1, 20);
        todo1.addTask("lave risotto", 1, 20);
        todo1.completeTask(0);
        // todo1.completeTask(0);
        // todo1.completeTask(0);
        // todo1.completeTask(0);
        // todo1.completeTask(0);
        // todo1.completeTask(0);
        todo1.print();
       

        
        




    }
}