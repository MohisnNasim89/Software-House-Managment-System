public class EmployeeInfo extends Person{
    private int empSalary;
    private String employeeDesignation;
    private int empProjects;
    private ProjectInfo projectInfo;


    public EmployeeInfo(int empId, String empName, String fatherName, String educationLvl,String empCnic, PhoneNumber empPhoneNumber, String empEmailAddress, DateClass empDateofBirth, Address empAddress, int empSalary)
    {
        super(empId, empName, fatherName, educationLvl, empCnic, empPhoneNumber, empEmailAddress, empDateofBirth, empAddress);
        setEmpSalary(empSalary);
    }

    public EmployeeInfo(int empId, String empName, String empEmailAddress) {
        super(empId, empName, empEmailAddress);
    }
    public EmployeeInfo(){

    }
    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        if(empSalary > 0)
            this.empSalary = empSalary;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public int getEmpProjects() {
        return empProjects;
    }

    public void setEmpProjects(int empProjects) {
        this.empProjects = empProjects;
    }

//    public void addProject(EmployeeInfo employee, ProjectAssignment projects, int project){
//        if(projects.isProjectStatus() == true)
//        {
//            this.projects[3] = projects;
//            int temp=0;
//            temp++;
//            temp += employee.getEmpProjects();
//            employee.setEmpProjects(temp);
//        }
//        else
//            System.out.println("YOU ALREADY HAVE AN UNCOMPLETED TASK");
//    }

}
