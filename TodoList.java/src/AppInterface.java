import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AppInterface {


    /**
     * Print out the opening message for the user.
     */
    ArrayList<Task> theList;

    public static void printWelcome() {

        System.out.println("**************************************");
        System.out.println("Welcome to the To Do List Application!");
        System.out.println("**************************************");

    }

    public static void selectOptions() {

        System.out.println("                                        ");
        System.out.println("Please select your options");
        System.out.println("                                      ");
        System.out.println("1. Show Task List");
        System.out.println("2. Add new Task");
        System.out.println("3. Update Task");
        System.out.println("4. Update task as done");
        System.out.println("5. Remove Task");
        System.out.println("6. Save and Quit");
        System.out.println("---------------------------------------");


        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("Input is not a number.");
            in.nextLine();
        }
        int userInput = in.nextInt();

        int i;

        //switch case
        TaskManager tm = new TaskManager();
        switch (userInput) {
            case 1:
                //call showTask();
                i = 1;
                tm.showTask();
                AppInterface b = new AppInterface();
                b.selectOptions();
                break;
            case 2:
                //call createTask
                i = 2;
                tm.createTask();
                break;

            case 3:
                //call editTask
                i = 3;
                tm.editTask();
                break;

            case 4:
                //call changeTaskStatus
                i = 4;
                break;

            case 5:
                //call removeStatus
                i = 5;
                break;

            case 6:
                //call saveToFile
                i = 6;
                break;


        }
    }

}