package Class2T.example1;

public class BasicPassword extends Password{
    public BasicPassword() {
        super("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
    }
}
