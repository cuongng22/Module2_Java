package CopyFileText;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MethodWriteRead {
    public static void main(String[] args) throws IOException {
        String pathName = "C:\\Users\\Admin\\Desktop\\16. IO Text File\\src\\CopyFileText\\fileCopy.txt";
        File file = new File(pathName);

        if (!file.exists()) {
            file = createFile(pathName);
        }

        Scanner input = new Scanner(System.in);
        String addStr = input.nextLine();

        ArrayList<String> strings = readFile(file);
        strings.add(addStr);
        strings.forEach(System.out::println);
        writeFile(file, strings);
    }

    public static File createFile(String pathName) throws IOException {
        File fileNew = new File(pathName);
        fileNew.createNewFile();
        return fileNew;
    }

    public static void writeFile(File file, ArrayList<String> str) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        for (String string : str) {
            buff.write(string + "\n");
        }
        buff.close();
    }

    public static ArrayList<String> readFile(File file) throws IOException {
        ArrayList<String> str = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader buff = new BufferedReader(fileReader);
        String line;

        while ((line = buff.readLine()) != null) {
            str.add(line);
        }

        buff.close();
        return str;
    }
}
