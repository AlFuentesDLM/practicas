package Class2T.example1;

public class StrongPassword extends Password{

    public StrongPassword() {
        super("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
    }
}
