package weekly2;

public class Student extends Person {

    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        setFacultyNumber(facultyNumber);
    }

    public String getFacultyNumber() {

        return facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {

        if ((facultyNumber.matches("[A-Za-z0-9]+")) && (facultyNumber.length() <= 10) && (facultyNumber.length() >= 5)) {
            this.facultyNumber = facultyNumber;
        } else {
            this.facultyNumber = "error";
        }
    }

    @Override
    public String toString() {
        System.out.println("First Name : " + getFirstName());
        System.out.println("Last Name : " + getLastName());
        System.out.println("Faculty Number : " + getFacultyNumber());
        //return getFacultyNumber() + getFirstName() + getLastName();
        return "\n";
    }
}
