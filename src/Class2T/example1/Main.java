package Class2T.example1;

public class Main {
    public static void main(String[] args) {
        Password ps = new BasicPassword();
        Password ps2 = new MediumPassword();
        Password ps3 = new StrongPassword();
        ps.setValue("lamundo1"); // at least 8 characters between number and letters
        ps2.setValue("Lamundo1"); // letters - numbers - uppercase - lowerCase
        ps3.setValue("Lamundo1!");// same above but with 1 special characters
    }
}
