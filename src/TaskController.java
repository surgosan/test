import java.util.Scanner;

public class TaskController {
    public static void main(String[] args) {
        TaskList tasks = new TaskList();

        boolean quit = false;

        Scanner in = new Scanner(System.in);

        while (!quit) {
            System.out.println("Welcome, make a choice");
            System.out.println("" +
                    "1) add\n" +
                    "2) remove\n" +
                    "3) quit");
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Add new task");
                    String task = in.nextLine();
                    tasks.addTask(task);
                    break;
                case 2:
                    System.out.println(tasks.getNextTask());
                    break;
                case 3:
                    quit = true;
                    break;
            }
        }
    }
}
