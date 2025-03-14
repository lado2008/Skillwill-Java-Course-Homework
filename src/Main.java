import f1Drivers.F1DriversList;

public class Main {
    public static void main(String[] args) {
        F1DriversList driver1 = new F1DriversList();
        driver1.setName("Charles Leclerc");
        driver1.setAge(27);
        driver1.setF1Team("Scuderia Ferrari HP");
        driver1.setPodiums(43);
        driver1.setRisingNumber(16);

        F1DriversList driver2 = new F1DriversList("George Russell", 27, "Mercedes-AMG PETRONAS F1 Team", 15, 63);

        System.out.println("Driver Name: " + driver2.getName());
        System.out.println("Driver Age: " + driver2.getAge());
        System.out.println("F1 Team: " + driver2.getF1Team());
        System.out.println("Amount of Podiums: " + driver2.getPodiums());
        System.out.println("Driver Rising Number: " + driver2.getRisingNumber());
    }
}