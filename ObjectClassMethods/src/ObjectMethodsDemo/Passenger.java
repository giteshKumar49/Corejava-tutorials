package ObjectMethodsDemo;

import java.util.Objects;

public class Passenger {
    private String firstName;
    private String lastname;

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
//        super.toString();
        return "Passenger{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(firstName, passenger.firstName) && Objects.equals(lastname, passenger.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastname);
    }
}
