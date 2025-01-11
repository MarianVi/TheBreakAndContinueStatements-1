import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TO DO:

        int sum = 0;
        int cnt = 0;

        while (cnt < 10){
            int numar = sc.nextInt();
            if (numar < 0) {
                break;
            }
            sum += numar;
            cnt++;
        }
        System.out.println(sum);
    }
}