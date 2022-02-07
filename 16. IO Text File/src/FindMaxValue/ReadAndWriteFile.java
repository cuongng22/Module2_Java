package FindMaxValue;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = "";

            while ((line = br.readLine()) != null ){
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return numbers;
    }

    public void wrireFile(String str, int max){
        try {
            FileWriter writer = new FileWriter(str, true);
            BufferedWriter buff = new BufferedWriter(writer);
            buff.write("+"+max);
            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
