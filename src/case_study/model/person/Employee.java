package case_study.model.person;

public class Employee extends Person {
    private String employeeCode;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(String employeeCode, String position, int salary) {
        this.employeeCode = employeeCode;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, String dateOfBirth, String gender, int id, int phoneNumber, String email, String level) {
        super(name, dateOfBirth, gender, id, phoneNumber, email, level);
    }

    public Employee(String employeeCode, String name ) {
        super(name);
        this.employeeCode = employeeCode;
    }

    public Employee(String employeeCode,String name, String dateOfBirth) {
        super(name, dateOfBirth);
        this.employeeCode = employeeCode;
    }


    public Employee(String employeeCode, String name, String dateOfBirth, String gender, int id, int phoneNumber, String email, String level, String position, int salary) {
        super(name, dateOfBirth, gender, id, phoneNumber, email, level);
        this.employeeCode = employeeCode;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s\n",
                this.getEmployeeCode(),
                this.getName(),
                this.getDateOfBirth(),
                this.getGender(),
                this.getId(),
                this.getPhoneNumber(),
                this.getEmail(),
                this.getLiteracy(),
                this.getPosition(),
                this.getSalary());
    }


    @Override
    public String toString() {
        return "Employee Code: " + employeeCode +
                super.toString() +
                ", Position: " + position + '\'' +
                ", Salary: " + salary;
    }
}
