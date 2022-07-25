package case_study.model.person;

public abstract class Person {

    private String name;
    private String dateOfBirth;
    private String gender;
    private int id;
    private int phoneNumber;
    private String email;
    private String level;

    public Person() {
    }

    public Person(String name, String dateOfBirth, String gender, int id, int phoneNumber, String email, String level) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return
                "Name; " + name +
                ", Date Of Birth: " + dateOfBirth +
                ", Gender: " + gender +
                ", ID: " + id +
                ", Phone Number: " + phoneNumber +
                ", Email: " + email +
                ", Level: " + level;

    }
}
