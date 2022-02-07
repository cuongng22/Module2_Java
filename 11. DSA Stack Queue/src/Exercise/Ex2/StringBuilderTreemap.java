package Exercise.Ex2;

import java.util.Map;
import java.util.TreeMap;

public class StringBuilderTreemap {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';


    public static Map<String, Integer> countWords(String input){
        Map<String, Integer> words = new TreeMap<>();

        if (input == null){
            return words;
        }
        int size = input.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE & input.charAt(i) != TAB & input.charAt(i) != BREAK_LINE){
                sb.append(input.charAt(i));
            } else {
                addWord(words, sb);
                sb = new StringBuilder();
            }
        }
        addWord(words, sb);
        return words;
    }

    public static void addWord(Map<String, Integer> words, StringBuilder sb){
        String word = sb.toString();
        if (word.length() == 0){
            return;
        }
        if (words.containsKey(word)){
            int count = words.get(word)+ 1;
            words.put(word, count);
        } else{
            words.put(word, 1);
        }
    }

    public static void main(String[] args) {
        String str = "java la ngon ngu lap thuan huong doi tuong "
                +", c la ngon ngu lap trinh "
                +", c++ la ngon ngu lap trinh duoc phat trien tren nen tang cau ngon ngu lap trinh c";

        System.out.println("--");
        System.out.println(str);
        System.out.println("--");
        System.out.println("_-.-_");

        Map<String, Integer> map = countWords(str);
        for (String key : map.keySet()) {
            System.out.printf("%s : %s",key,map.get(key));
            System.out.println();
        }
    }
}
