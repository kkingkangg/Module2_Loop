import java.util.Scanner;
public class LessThan100Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập giới hạn của các số nguyên tố");
        int limit = input.nextInt();
        int num = 2;

        while (num<=limit){
            if (checkPrime(num)) {
                System.out.print(num + ",");
            }
            num++;
        }

    }

    static boolean checkPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }

}