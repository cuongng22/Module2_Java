package Exercise.StopWatch;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        LocalTime start = LocalTime.now();
        selectionSort(array);
        LocalTime end = LocalTime.now();
        StopWatch sw = new StopWatch(start, end);
        for (int x : array) {
            System.out.println(x);
        }
        System.out.println("Time: " + sw.getElapsedTime());
    }

    public static int[] selectionSort(int...a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int tempt = a[i];
                    a[i] = a[j];
                    a[j] = tempt;
                }
            }
        }
        return a;
    }
}
