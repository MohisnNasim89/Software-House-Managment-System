public class Person {
    private int id;
    private String name;
    private String fatherName;
    private String educationLvl;
    private String cnic;
    private PhoneNumber phoneNumber;
    private String emailAddress;
    private DateClass dateOfBirth;
    private Address address;

    public Person(int id, String name, String fatherName, String educationLvl, String cnic, PhoneNumber phoneNumber, String emailAddress, DateClass dateOfBirth, Address address) {

        setId(id);
        setName(name);
        setFatherName(fatherName);
        setEducationLvl(educationLvl);
        setCnic(cnic);
        setPhoneNumber(phoneNumber);
        setDateOfBirth(dateOfBirth);
        setAddress(address);
        setEmailAddress(emailAddress);
    }

    public Person(int id, String name, String emailAddress, String cnic, PhoneNumber phoneNumber) {
        setId(id);
        setName(name);
        setCnic(cnic);
        setPhoneNumber(phoneNumber);
    }

    public Person(int id, String name, String emailAddress) {
        setId(id);
        setName(name);
        setEmailAddress(emailAddress);
    }
    public Person(){

    }
    public int getId() {return id;}

    public void setId(int id) {
        if(id>0)
            this.id = id;
        else {
            System.out.println("\"Invalid Id\"");
        }
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCnic() { return cnic;}

    public void setCnic(String cnic) { this.cnic = cnic; }

    public PhoneNumber getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(PhoneNumber phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmailAddress() { return emailAddress; }

    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }

    public DateClass getDateOfBirth() { return dateOfBirth; }

    public void setDateOfBirth(DateClass dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public Address getAddress() { return address; }

    public void setAddress(Address address) { this.address = address; }

    public String getFatherName() { return fatherName; }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getEducationLvl() { return educationLvl; }

    public void setEducationLvl(String educationLvl) {
        this.educationLvl = educationLvl;
    }

}