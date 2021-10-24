
public class You {

    // Fields
    private String firstname;
    private String lastname;
    private int age;
    private String ethnicity;

    // Setters and Getters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getYou() {
        return "First Name: " + firstname + "\n" + "Last Name: " + lastname + "\n" + "Age: " + age + "\n" + "Ethnicity: " + ethnicity;
    }
}

