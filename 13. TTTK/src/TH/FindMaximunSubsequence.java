package TH;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaximunSubsequence {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> max = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chuỗi : ");
        String string = input.nextLine();

        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch : max) System.out.print(ch);
        System.out.println();
    }
}
