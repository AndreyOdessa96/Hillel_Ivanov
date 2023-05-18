package dz6;

public class Subscriber {
    private int id;
    private String lastName;
    private String firstName;
    private String city;
    private String phoneNumber;
    private int contractNumber;
    private double balance;
    private int cityCallDuration;
    private int interCityCallDuration;
    private double internetTraffic;

    public Subscriber(int id, String lastName, String firstName, String city, String phoneNumber,
                      int contractNumber, double balance, int cityCallDuration,
                      int interCityCallDuration, double internetTraffic) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.contractNumber = contractNumber;
        this.balance = balance;
        this.cityCallDuration = cityCallDuration;
        this.interCityCallDuration = interCityCallDuration;
        this.internetTraffic = internetTraffic;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCityCallDuration(int cityCallDuration) {
        this.cityCallDuration = cityCallDuration;
    }

    public void setInterCityCallDuration(int interCityCallDuration) {
        this.interCityCallDuration = interCityCallDuration;
    }

    public void setInternetTraffic(double internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getCityCallDuration() {
        return cityCallDuration;
    }

    public int getInterCityCallDuration() {
        return interCityCallDuration;
    }

    public double getInternetTraffic() {
        return internetTraffic;
    }

    @Override
    public String toString() {
        return "Subscriber{" + "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName +
                ", city=" + city + ", phoneNumber=" + phoneNumber + ", contractNumber=" + contractNumber +
                ", balance=" + balance + ", cityCallDuration=" + cityCallDuration +
                ", interCityCallDuration=" + interCityCallDuration + ", internetTraffic=" + internetTraffic +
                '}';
    }
}
