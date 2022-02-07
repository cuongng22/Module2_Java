package FindMaxValue;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++){
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readLine = new ReadAndWriteFile();
        List<Integer> list = readLine.readFile("C:\\Users\\Admin\\Desktop\\16. IO Text File\\src\\FindMaxValue\\numbers.txt");
        int maxValue = findMax(list);
        System.out.println(maxValue);
        readLine.wrireFile("C:\\Users\\Admin\\Desktop\\16. IO Text File\\src\\FindMaxValue\\result.txt", maxValue);
    }
}
