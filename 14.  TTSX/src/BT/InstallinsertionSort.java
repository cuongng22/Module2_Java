package BT;

import java.util.Arrays;

public class InstallinsertionSort {
    static double[] list = {1, 6, 9 , 7.3, 6.9, 3, 4, 5.6};

    public static void insertionSort(double[] list){
        double x;
        int pos;
        for(int i=1; i<list.length; i++){
            x = list[i];
            pos = i;
            while(pos > 0 && x < list[pos -1]){
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
