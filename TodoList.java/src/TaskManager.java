import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {

    AppInterface b = new AppInterface();
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

        //AppInterface b = new AppInterface();
        b.selectOptions();
    }

    public void editTask()

    {
        System.out.println("Please select the task to be edited from below list");
        System.out.println("                                                   ");
        //AppInterface b = new AppInterface();
        TaskManager tm = new TaskManager();
        showTask();

        System.out.println("                                                   ");
        System.out.println("Please enter the S.No to be edited from the list provided");
        System.out.println("                                                         ");

        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("Input is not a number.");
            in.nextLine();
        }
        int sno = in.nextInt();

        Task t = list.get(sno);

                System.out.println("                                                   ");
                System.out.println("Please confirm the changes to be done");
                System.out.println("                                      ");
                System.out.println("1. Edit Title");
                System.out.println("2. Edit Due date");
                System.out.println("3. Edit Project Name");
                System.out.println("4. Edit Status");
                System.out.println("5. Quit");
                System.out.println("                                      ");

                int userInput = in.nextInt();

                switch (userInput)
                {
                    case 1:
                        System.out.println("Please enter the new title");
                        String title =  in.next();
                        t.title= title;
                        System.out.println("Updated successfully !!");
                        showTask();
                        b.selectOptions();
                        break;

                    case 2:
                        System.out.println("Please enter the new date");
                        String date = in.next();
                        t.dueDate = date;
                        System.out.println("Updated successfully !!");
                        showTask();
                        b.selectOptions();
                        break;

                    case 3:
                        System.out.println("Please enter the new project name");
                        String Project = in.next();
                        t.project = Project;
                        System.out.println("Updated successfully !!");
                        showTask();
                        AppInterface.selectOptions();
                        break;

                    case 4:
                        System.out.println("Please enter the new status");
                        String Status = in.next();
                        t.status = Status;
                        System.out.println("Updated successfully !!");
                        showTask();
                        b.selectOptions();
                        break;

                    case 5:
                        System.out.println("Quit");
                        break;

        }
    }

    public void removeTask()

    {
        //AppInterface b = new AppInterface();
        TaskManager tm = new TaskManager();

        System.out.println("                                                   ");
        System.out.println("Please enter the S.No to be removed from the list provided");
        showTask();
        System.out.println("                                                   ");

        Scanner in=new Scanner(System.in);

        while (!in.hasNextInt()) {
            System.out.println("Input is not a number.");
            in.nextLine();
        }
        int num=in.nextInt();
        if (num > list.size()-1){
            System.out.println("Invalid Input !!");
            b.selectOptions();
        }
        else {
            list.remove(num);
            System.out.println("List Updated Successfully !!");
            showTask();
            b.selectOptions();
        }
    }


    public static void saveToFile()

    {

    }


}
