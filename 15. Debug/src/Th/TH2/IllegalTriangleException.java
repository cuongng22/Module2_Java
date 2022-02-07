package Th.TH2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    public static void checkTriangle(double num1, double num2, double num3) throws TriangleEdgesException {
        final boolean b1 = num1 + num2 > num3 & num1 + num3 > num2 & num2 + num3 > num1;
        final boolean b2 = num1 > 0 & num2 > 0 & num3 > 0;
        if (b1 & b2) {
            System.out.println("Tam giac hop le!");
        } else {
            throw new TriangleEdgesException("Loi: Tam giac khong hop le!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Nhap vao canh thu nhat: ");
            double a = input.nextDouble();
            System.out.print("Nhap vao canh thu hai: ");
            double b = input.nextDouble();
            System.out.print("Nhap vao canh thu ba: ");
            double c = input.nextDouble();
            try {
                checkTriangle(a, b, c);
            } catch (TriangleEdgesException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("Loi: dinh dang!");
        }
        input.close();
    }
}
