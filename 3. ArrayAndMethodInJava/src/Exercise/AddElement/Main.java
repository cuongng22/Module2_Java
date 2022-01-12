package Exercise.AddElement;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Nhập vào index của phần tử: ");
        int index;
        index = scanner.nextInt();

        while (index > 0 & index < arr.length - 1) {
            System.out.println("Nhập vào phần tử muốn thêm: ");
            int num = scanner.nextInt();
            int[] arr2 = new int[arr.length + 1];
            for (int j = 0; j < arr2.length - 1; j++) {
                arr2[j] = arr[j];
            }
            for (int i = index + 1; i < arr2.length-1; i++) {
                arr2[i] = arr[i];
            }
            arr2[index] = num;
            System.out.println("new aray = " + Arrays.toString(arr2));
        }
    }
}
