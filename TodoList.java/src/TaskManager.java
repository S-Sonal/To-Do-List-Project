import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class TaskManager {


   private static ArrayList<Task> theList;
    public static void createTask()

    {
        Task tsk = new Task();
        System.out.println("Following details are required to add a new task");
        System.out.println("                                      ");
        System.out.println("Please enter title : ");
        Scanner in = new Scanner(System.in);
        String title =  in.next();
        System.out.println("Please enter due date : ");
        String date = in.next();
        System.out.println("Please enter project : ");
        String project = in.next();
        System.out.println("Please enter status: ");
        String status = in.next();
        tsk.title = title;
        tsk.dueDate = date;
        tsk.project = project;
        tsk.status = status;

        theList.add(tsk);

        System.out.println("Task has been successfully added");

    }

    public static void editTask() {
        System.out.println("Would you like to edit the task ?");
        System.out.println("                                  ");
        System.out.println("Confirm Y/N");
        Scanner in = new Scanner(System.in);
        String Confirm = in.next();
        String i;

        switch (Confirm)
        {
            case "one":
                i = "Y";
                System.out.println("Please enter the task details to modify");
                // call showTask
                System.out.println("Please enter the title");
                String title =  in.next();
                System.out.println("Please enter the due date");
                String date = in.next();
                //theList.set(1,tsk);
                break;

            case "two":
                i = "N";
                System.out.println("No edit required.");
                break;
        }
    }

    public static void removeTask()

    {
     //theList.remove(2);
        // System.out.println(theList);
    }

    public static void changeTaskStatus()

    {

    }

    public static void saveToFile()

    {

    }

    public static void loadFile()

    {

    }

    public static void showTask()

    {

    }

    public static void sort()

    {

    }
}
