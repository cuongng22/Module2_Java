package Validate_phone_number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneNumberExample phoneNumberExample = new PhoneNumberExample();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String number = input.nextLine();

        boolean isPhoneNumber = phoneNumberExample.isPhoneNumber(number);
        System.out.printf("Phone number: %s _ %s",number,isPhoneNumber);
    }
}
