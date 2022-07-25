package case_study.model;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String roomStandard, double poolArea, int floor) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public Villa(String name, double area, double rentalCost, int maxNumberOfPeople, String rentalType, String roomStandard, double poolArea, int floor) {
        super(name, area, rentalCost, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa: " + super.toString() +
                " Room Standard = " + roomStandard +
                ", PoolArea = " + poolArea +
                ", Floor = " + floor;
    }
}
