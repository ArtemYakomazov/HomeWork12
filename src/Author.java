public class Author {
private  String firstName;
private  String lastName;

    public Author (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author book2 = (Author) other;
        return firstName.equals(book2.firstName) && lastName.equals(book2.lastName);
    }
    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName);
    }

}
