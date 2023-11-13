import java.time.LocalDate;

public class DateClass {
    private int date;
    private int monthNo;
    private int year;
    private LocalDate dob;

    public DateClass(int date, int monthNo, int year) {
        this.date = date;
        this.monthNo = monthNo;
        this.year = year;
        this.dob = LocalDate.of(year, monthNo, date);
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setMonthNo(int monthNo) {
        this.monthNo = monthNo;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDob() {
        return dob;
    }
}
