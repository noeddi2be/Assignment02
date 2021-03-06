
public class You {

    // Fields
    private String firstname;
    private String lastname;
    private int age;
    public enum Ethnicity {
        African, American, Australian, Asian, European, Latin_American
    };
    private Ethnicity yEthnicity;

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

    public void setEthnicity(Ethnicity yEthnicity) {
        this.yEthnicity = yEthnicity;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public Ethnicity getEthnicity() {
        return yEthnicity;
    }
}

