package case_study.model;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String name, double area, double rentalCost, int maxNumberOfPeople, String rentalType, String freeService) {
        super(name, area, rentalCost, maxNumberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room: " + super.toString() +
                ", Free Service = " + freeService;
    }
}
