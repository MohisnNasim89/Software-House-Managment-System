public class PhoneNumber {
    private int countryCode;

    private long phoneNumber;

    public PhoneNumber(int countryCode, long phoneNumber) {
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}
