import java.util.Scanner;

public class AppInterface {


    /**
     * Print out the opening message for the user.
     */


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
        System.out.println("4. Remove Task");
        System.out.println("5. Save and Quit");
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
                System.out.println("Following details are required to add a new task");
                System.out.println("                                      ");
                tm.createTask();
                break;

            case 3:
                //call editTask
                i = 3;
                System.out.println("Please select the task to be edited from below list");
                System.out.println("                                                   ");

                tm.showTask();

                System.out.println("                                                   ");
                System.out.println("Please enter the S.No to be edited from the list provided");
                System.out.println("                                                         ");

                tm.editTask();
                break;

            case 4:
                //call removeStatus
                i = 4;
                System.out.println("                                                   ");
                System.out.println("Please enter the S.No to be removed from the list provided");
                tm.showTask();
                System.out.println("                                                   ");
                tm.removeTask();
                break;

            case 5:
                //Save and Quit
                i = 5;
                //tm.saveToFile();
                break;
        }
    }

}