package Exercise.prime100;

public class Main {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(2);
        boolean check = false;
        while (n<100) {
            for (int i =2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(n);
            }
            check = true;
            n++;
        }
    }
}
