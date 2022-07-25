package case_study.model;

public class House extends Facility {
    private String roomStandard;
    private int floor;

    public House() {
    }

    public House(String roomStandard, int floor) {
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public House(String name, double area, double rentalCost, int maxNumberOfPeople, String rentalType, String roomStandard, int floor) {
        super(name, area, rentalCost, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House: " + super.toString() +
                ", Room Standard = " + roomStandard +
                ", Floor = " + floor;
    }
}
