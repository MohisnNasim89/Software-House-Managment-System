import java.time.LocalDate;

public class ProjectAssignment extends ProjectInfo {

    private DateClass deadlineOfSubmission;
    private DateClass dateOfAssignment;
    private boolean projectStatus;

    public DateClass getDateOfAssignment() {
        return dateOfAssignment;
    }

    public void setDateOfAssignment(DateClass dateOfAssignment) {
        this.dateOfAssignment = dateOfAssignment;
    }

    public void setProjectStatus(boolean projectStatus) {
        this.projectStatus = projectStatus;
    }
    public void setDeadlineOfSubmission(DateClass deadlineOfSubmission) {
        this.deadlineOfSubmission = deadlineOfSubmission;
    }

    public boolean isProjectStatus() {
        return projectStatus;
    }
    public DateClass getDeadlineOfSubmission() {
        return deadlineOfSubmission;
    }
    public void addProject(ClientInfo clientInfo){
        System.out.println("Client Id: "+ clientInfo.getId());
        System.out.println("Client Name: "+clientInfo.getName());
        System.out.println("");

    }
}
