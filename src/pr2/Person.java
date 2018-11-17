package pr2;
//commecntxpogjrojgregjoergjergoegijeojrgoejgreojg
public class Person {

    private String firstName;
    private String lastName;

    Person(String firstName, String lastName) {

        setLastName(lastName);
        setFirstName(firstName);
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        if ((firstName.matches("[a-zA-Z]+")) && (firstName.length() > 2)) {

            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
            this.firstName = firstName;
        } else {
            this.firstName = "error";

        }
    }

    public void setLastName(String lastName) {

        if ((lastName.matches("[a-zA-Z]+")) && (lastName.length() > 3)) {

            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
            this.lastName = lastName;
        } else {
            this.lastName = "error";
        }
    }

    public String getLastName() {

        return lastName;
    }
}
