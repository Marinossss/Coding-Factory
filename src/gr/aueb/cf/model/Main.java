package gr.aueb.cf.model;

public class Main {


    public static void main(String[] args) {

        User Marinos = new User(13, "Marinos", "Good");
        UserCredentials Marinos1 = new UserCredentials(10, "sake13", "Strong");

        Marinos.setId(1);


        System.out.println("{" + Marinos.getId() + "," + Marinos.getFirstname() + "," + Marinos.getLastname() + "}");
        System.out.println("{" + Marinos1.getId() + "," + Marinos1.getUsername() + "," + Marinos1.getPassword() + "}");
    }
}
