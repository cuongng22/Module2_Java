package Practice.FindMaxInArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Nhập tên học sinh muốn tìm");
        String name = scanner.nextLine();
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)){
                check =true;
                n = i;
                break;
            }
        }
        if (check) {
            System.out.println("Bạn "+ name +" đứng ở vị trí thứ "+ (n+1) +" trong mảng!");
        } else System.out.println("Không có trong mảng");
    }
}
