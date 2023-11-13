import java.util.ArrayList;

public class ClientInfo extends Person {
    private String companyName;
    private ArrayList<ProjectAssignment> clientProject;

    public ClientInfo(int clientId, String clientName, String clientCnic, PhoneNumber clientPhoneNumber, String clientEmailAddress, String companyName) {
        super(clientId, clientName, clientCnic, clientEmailAddress, clientPhoneNumber);
        this.companyName = companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public ArrayList<ProjectAssignment> getClientProject() {
        return clientProject;
    }

    public void setClientProject(ArrayList<ProjectAssignment> clientProject) {
        this.clientProject = clientProject;
    }

    public void addProject(ClientInfo client){

    }

}
