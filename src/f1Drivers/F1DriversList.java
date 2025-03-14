package f1Drivers;

public class F1DriversList {
    private String name;
    private int age;
    private String f1Team;
    private int podiums;
    private int risingNumber;

    public F1DriversList() {}

    public F1DriversList(String name, int age, String f1Team, int podiums, int risingNumber) {
        this.name = name;
        this.age = age;
        this.f1Team = f1Team;
        this.podiums = podiums;
        this.risingNumber = risingNumber;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getF1Team() { return f1Team; }
    public int getPodiums() { return podiums; }
    public int getRisingNumber() { return risingNumber; }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setF1Team(String f1Team) {
        this.f1Team = f1Team;
    }
    public void setPodiums(int podiums) {
        this.podiums = podiums;
    }
    public void setRisingNumber(int risingNumber) {
        this.risingNumber = risingNumber;
    }
}
