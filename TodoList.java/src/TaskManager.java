import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {


    static ArrayList<Task> list= new ArrayList<>();

    public static void showTask()

    {
        System.out.println("S.No     Title        Date         Status           Project");
        for (int i = 0; i < list.size(); i++) {
            // if ( list.size() == 0) {
            //System.out.println(" No task in the list");
            //}
            //else {
            System.out.println(i + " " + list.get(i));
            //}
        }
    }

    public  void createTask()

    {

        System.out.println("Following details are required to add a new task");
        System.out.println("                                      ");
        System.out.println("Please enter title : ");
        Scanner in = new Scanner(System.in);
        String title =  in.next();
        System.out.println("Please enter due date : ");
        String dueDate = in.next();
        System.out.println("Please enter project : ");
        String project = in.next();
        System.out.println("Please enter status: ");
        String status = in.next();

        Task task = new Task(title, dueDate, project, status);
        list.add(task);

        System.out.println(list);
        System.out.println("Task has been successfully added");
        System.out.println("                                      ");

        AppInterface b = new AppInterface();
        b.selectOptions();
    }

    public void editTask() {
        System.out.println("Would you like to edit the task ?");
        System.out.println("                                  ");
        System.out.println("Confirm Y/N");
        Scanner in = new Scanner(System.in);
        String Confirm = in.next();

        switch (Confirm)
        {
            case "Y":

                TaskManager tm = new TaskManager();
                tm.showTask();

                System.out.println("Please confirm the changes to be done");
                System.out.println("                                      ");
                System.out.println("1. Edit Title");
                System.out.println("2. Edit Due date");
                System.out.println("3. Edit Project Name");
                System.out.println("4. Edit Status");
                System.out.println("5. Quit");
                System.out.println("                                      ");

                int userInput = in.nextInt();
                //int i;

                switch (userInput) {
                    case 1:
                        //i = 1;
                        System.out.println("Please enter the new title");
                        String title =  in.next();
                        //.setTitle(title);
                        break;

                    case 2:
                        //i = 2;
                        System.out.println("Please enter the new date");
                        String date = in.next();
                        break;

                    case 3:
                        //i = 3;
                        System.out.println("Please enter the new project name");
                        String project = in.next();
                        break;

                    case 4:
                        //i = 4;
                        System.out.println("Please enter the new status");
                        String status = in.next();
                        break;

                    case 5:
                        //i = 4;
                        System.out.println("Quit");
                        break;

                }
                //theList.set(1,tsk);
                break;

            case "N":

                System.out.println("No update required.");
                break;
        }
    }

    public static void removeTask()

    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter position you want to delete");
        int num=in.nextInt();
        //heList.remove(num);
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

    public static void sort()

    {

    }
}
