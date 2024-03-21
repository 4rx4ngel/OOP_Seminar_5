package data;

public class Student extends User{
    private int studentID;

    public Student(String fullName, int yearOfBirth, String address, int studentID) {
        super(fullName, yearOfBirth, address);
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", fullName='" + fullName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", address='" + address + '\'' +
                '}';
    }
}
