package homework.model;

public class Student extends Person {
    private String className;
    private double score;

    public Student() {
    }

    public Student(int id, String name, String dayOfBirth, String gender, String className, double score) {
        super(id, name, dayOfBirth, gender);
        this.className = className;
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + " " +
                ", ID: " + getId() +
                ", Tên: " + getName() +
                ", Ngày sinh: " + getDayOfBirth() +
                ", Giới tính: " + getGender() +
                ", Tên lớp: = '" + getClassName() +
                ",  Điểm:  =" + getScore();
    }
}
