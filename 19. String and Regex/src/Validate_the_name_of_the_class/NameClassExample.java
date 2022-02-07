package Validate_the_name_of_the_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClassExample {
    private static final String nameClass = "^[A|C|P][0-9]{4}[G|H|I|K|L|M]$";

    public NameClassExample() {
    }

    public boolean validate(String name) {
        Pattern pattern = Pattern.compile(nameClass);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

}
