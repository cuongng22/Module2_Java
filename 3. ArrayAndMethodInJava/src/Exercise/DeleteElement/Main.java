package Exercise.DeleteElement;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 0, 6 ,7, 9};
        System.out.println("Nhập pt muỗn xoá: ");
        int num = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] == num) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                    arr[arr.length-1] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}