package Class2T.example1;

import java.util.regex.PatternSyntaxException;

public class Password {
    private String regex;
    private String value;


    public Password(String regex){
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if (value.matches(regex)){
            this.value = value;
        }else{
            throw new PatternSyntaxException("This value doesn't match the current regular expresion",regex,-1);
        }
    }
}
