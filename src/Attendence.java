public class Attendence{

    EmployeeInfo employee;
    private boolean attendance;
    public Attendence(EmployeeInfo employee, boolean attendance)
    {
        setAttendance(attendance);
        if(attendance == true);

    }

    public void setAttendance(boolean attendance) {
        this.attendance = attendance;
    }

    public boolean getAttendance() {
        return attendance;
    }
}
