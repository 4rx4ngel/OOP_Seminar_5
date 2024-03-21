package data;

public class Teacher extends User{
    private int teacherID;

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                ", fullName='" + fullName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", address='" + address + '\'' +
                '}';
    }

    public Teacher(String fullName, int yearOfBirth, String address, int teacherID) {
        super(fullName, yearOfBirth, address);
        this.teacherID = teacherID;
    }
}
