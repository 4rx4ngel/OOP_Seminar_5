package data;

public abstract class User {
    protected String fullName;
    protected int yearOfBirth;
    protected String address;

    public User(String fullName, int yearOfBirth, String address) {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }

    public User() {
    }

    public String getFullName() {
        return fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getAddress() {
        return address;
    }
}
