public class Address {
    private String countryName;
    private String cityName;
    private String town;
    private int streetNum;
    private int houseNum;

    public Address(String countryName, String cityName, String town, int streetNum, int houseNum) {
        this.countryName = countryName;
        this.cityName = cityName;
        this.town = town;
        this.streetNum = streetNum;
        this.houseNum = houseNum;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getTown() {
        return town;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public int getHouseNum() {
        return houseNum;
    }
}
