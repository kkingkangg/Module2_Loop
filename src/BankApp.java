import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        double firstMoney = sc.nextDouble();
        System.out.println("Nhập tháng gửi: ");
        int month = sc.nextInt();
        System.out.println("Nhập lãi suất: ");
        double interest_rate = sc.nextDouble();

        double lastMoney = 0;

        //Số tiền gửi trong month tháng
        for (int i =0; i < month; i++){
            lastMoney += firstMoney * (interest_rate/100)/12 * month;
        }
        System.out.println("Số tiền sau " + month + " gửi là: " + lastMoney);

    }
}