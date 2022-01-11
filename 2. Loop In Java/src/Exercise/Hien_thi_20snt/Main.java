package Exercise.Hien_thi_20snt;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int n = 2;
        boolean check = true;
        while (count<20) {
            for (int i =2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(n);
                count++;
            }
            check = true;
            n++;
        }
    }
}
