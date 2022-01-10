package Practice.CheckLeapYear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0 ) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Năm " + year + " là năm nhuận");
                }
            } else System.out.println("Năm " + year + " không là năm nhuận");
        } else  System.out.println("Năm " + year + " không là năm nhuận");
    }
}
