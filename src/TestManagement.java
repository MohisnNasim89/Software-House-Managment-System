public class TestManagement {
    public static void main(String[] args) {
        EmployeeInfo employee = new EmployeeInfo(98, "Ali", "Ahsan", "BCS",
                                        "3520296278593", new PhoneNumber(92, 3328379175L),
                                "mohsinnasim82@gmail.com", new DateClass(12, 10, 2002),
                                                new Address("Pakistan", "Lahore", "Faisal Town", 23, 10),
                                                500000);

        ProjectAssignment project = new ProjectAssignment();
        project.setProjectId(345);project.setProjectName("MANAGEMENT SYSTEM");project.setDeadlineOfSubmission(new DateClass(7,11,2023));project.setProjectStatus(true);
        employee.setEmpProjects(2);
        System.out.println("EMP ID: "+employee.getId());
        System.out.println("EMP NAME: "+employee.getName());
        System.out.println("EMP FATHER NAME: "+employee.getFatherName());
        System.out.println("EMP EDUCATIONAL LEVEL: "+employee.getEducationLvl());
        System.out.println("EMP CNIC: "+employee.getCnic());
        System.out.println("EMP PHONE NUMBER: +"+employee.getPhoneNumber().getCountryCode()+" "+employee.getPhoneNumber().getPhoneNumber());
        System.out.println("EMP EMAIL: "+employee.getEmailAddress());
        System.out.println("EMP DOB: "+employee.getDateOfBirth().getDob());
        System.out.println("EMP ADDRESS: ");
        System.out.println("\tCOUNTRY: "+employee.getAddress().getCountryName());
        System.out.println("\tCITY: "+employee.getAddress().getCityName());
        System.out.println("\tTOWN: "+employee.getAddress().getTown());
        System.out.println("\tSTREET NUMBER: "+employee.getAddress().getStreetNum());
        System.out.println("\tHOUSE NUMBER: "+employee.getAddress().getHouseNum());
        System.out.println("SALARY: "+employee.getEmpSalary());

        //employee.addProject(employee,project,5);
    }
}
