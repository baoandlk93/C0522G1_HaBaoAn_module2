package case_study.model;

public abstract class Facility {
    private String name;
    private double area;
    private double rentalCost;
    private int maxNumberOfPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String name, double area, double rentalCost, int maxNumberOfPeople, String rentalType) {
        this.name = name;
        this.area = area;
        this.rentalCost = rentalCost;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return
                "Name = " + name +
                ", Area = " + area +
                ", RentalCost = " + rentalCost +
                ", MaxNumberOfPeople = " + maxNumberOfPeople +
                ", RentalType = " + rentalType ;

    }
}
