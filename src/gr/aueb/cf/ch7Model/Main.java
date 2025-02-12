package gr.aueb.cf.ch7Model;

public class Main {


    public static void main(String[] args) {

        UserCredentials userCredentials = new UserCredentials(1, "john_doe", "password123");
        User user = new User(101, "John", "Doe", userCredentials);


        System.out.println("{" + user.getId() + "," + user.getFirstname() + "," + user.getLastname() + "}");
        System.out.println("{" + user.getCredentials().getId() + "," + user.getCredentials().getUsername() + "," + user.getCredentials().getPassword() + "}");

    }
}
