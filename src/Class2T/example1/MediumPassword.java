package Class2T.example1;

public class MediumPassword extends Password{

    public MediumPassword() {
        super("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$");
    }
}
