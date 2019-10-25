import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager  implements Serializable
{

    AppInterface b = new AppInterface();
    static ArrayList<Task> list = new ArrayList<>();

    public void showTask() {
        System.out.println("S.No     Title        Date         Status           Project");
        if (list.size() == 0) {
            System.out.println("                                        ");
            System.out.println(" No task in the list");
            System.out.println("**************************************");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + " " + list.get(i));
            }
        }
    }


    public void createTask() {
        System.out.println("Please enter title : ");
        Scanner in = new Scanner(System.in);
        String title = in.next();
        System.out.println("Please enter due date : ");
        String dueDate = in.next();
        System.out.println("Please enter project : ");
        String project = in.next();
        System.out.println("Please enter status: ");
        String status = in.next();

        Task task = new Task(title, dueDate, project, status);
        list.add(task);

        System.out.println(list);
        System.out.println("                                        ");
        System.out.println("Task has been successfully added");
        System.out.println("                                     ");

        b.selectOptions();
    }

    public void editTask() {

        Scanner in = new Scanner(System.in);

        while (!in.hasNextInt()) {
            System.out.println("                                        ");
            System.out.println("Input is not a number.");
            in.nextLine();
        }

        int sno = in.nextInt();
        if (sno > list.size() - 1) {
            System.out.println("                                        ");
            System.out.println("Invalid Input !!");
            b.selectOptions();
        } else {

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

            while (!in.hasNextInt()) {
                System.out.println("                                        ");
                System.out.println("Input is not a number.");
                in.nextLine();
            }
            int userInput = in.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("Please enter the new title");
                    String title = in.next();
                    t.title = title;
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
    }

    public void removeTask() {
        Scanner in = new Scanner(System.in);

        while (!in.hasNextInt()) {
            System.out.println("                                        ");
            System.out.println("Input is not a number.");
            in.nextLine();
        }
        int num = in.nextInt();
        if (num > list.size() - 1) {
            System.out.println("                                        ");
            System.out.println("Invalid Input !!");
            b.selectOptions();
        } else {
            list.remove(num);
            System.out.println("                                        ");
            System.out.println("List Updated Successfully !!");
            showTask();
            b.selectOptions();
        }
    }

    public void saveToFile()throws IOException, ClassNotFoundException

    {
        FileOutputStream fileOutputStream
                = new FileOutputStream("taskList");
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        objectOutputStream.close();
        System.out.println("                                        ");
        System.out.println("Task List Saved Successfully !!");

        FileInputStream fileInputStream
                = new FileInputStream("taskList");
        ObjectInputStream objectInputStream
                = new ObjectInputStream(fileInputStream);
        Task t = (Task) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("                                        ");
        System.out.println("Task List Saved Successfully !!");
    }


}


