package Validate_the_name_of_the_class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NameClassExample nameClass = new NameClassExample();
        Scanner input = new Scanner(System.in);
        System.out.print("The Name Of The Class: ");
        String nameClasss = input.nextLine();

        boolean isName = nameClass.validate(nameClasss);
        System.out.printf("The name of the class :%s - %s",nameClasss,isName);
    }
}
