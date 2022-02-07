package Validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static final String phoneNumber = "^(\\((\\+|)(84)\\))-\\((0|)[0-9]{9,10}\\)$";

    public PhoneNumberExample() {
    }

    public boolean isPhoneNumber(String phoneNumber1) {
        Pattern pattern = Pattern.compile(phoneNumber);
        Matcher matcher = pattern.matcher(phoneNumber1);
        return matcher.matches();
    }
}
