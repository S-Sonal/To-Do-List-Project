public class Task

{

public String title;
public String dueDate;
public String status;
public String project;


    public Task(String title, String dueDate, String status, String project) {
        this.title=title;
        this.dueDate=dueDate;
        this.status=status;
        this.project=project;
    }
    public void setTitle(String tTitle) { this.title = tTitle; }

    public String getTitle() { return this.title; }

    public void setDueDate(String dDate) { this.dueDate = dDate; }

    public String getDueDate() { return this.dueDate; }

    public void setStatus(String sStatus) { this.status = sStatus; }

    public String getStatus() { return this.status; }

    public void setProject(String pProject) { this.project = pProject; }

    public String getProject() { return this.project; }

    public String toString() {
        return "   " +title +"     "+ dueDate  + "     " + status  +"     " + project;
    }

}
