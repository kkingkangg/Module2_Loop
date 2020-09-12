import java.util.Scanner;
public class FirstPrimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số các số nguyên tố đầu tiên bạn muốn tìm");
        int limit = input.nextInt();
        int cout = 1;
        int num = 2;

        while (cout<=limit){
            if (checkPrime(num)) {
                System.out.print(num + ",");
                cout++;
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
