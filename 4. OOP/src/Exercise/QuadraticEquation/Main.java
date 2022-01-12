package Exercise.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp a");
        int a = scanner.nextInt();
        System.out.println("Nhâp b");
        int b = scanner.nextInt();
        System.out.println("Nhâp c");
        int c = scanner.nextInt();
        display(a,b,c);
    }

    public static void display(int a, int b, int c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("pt vô số no");
                } else System.out.println("pt vo nghiem");
            } else System.out.println("pt có 1 nghiệm la: "+ -c/b);
        } else {
            QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
            if (quadraticEquation.getDiscriminant()==0) {
                System.out.println("pt co nghiem kep = "+quadraticEquation.getRoot1());
            } else {
                if (quadraticEquation.getDiscriminant() < 0) {
                    System.out.println("pt vo nghiem");
                } else System.out.println("Pt co 2 no là "+ quadraticEquation.getRoot1()+" và "+quadraticEquation.getRoot2());
            }
        }
    }
}
