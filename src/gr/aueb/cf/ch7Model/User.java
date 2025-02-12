package gr.aueb.cf.ch7Model;

public class User {

    private long id;
    private String firstname;
    private String lastname;
    private UserCredentials credentials;

    public User() {

    }

    public User(long id, String firstname, String lastname, UserCredentials credentials) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.credentials = credentials;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public UserCredentials getCredentials() {
        return credentials;
    }
}
