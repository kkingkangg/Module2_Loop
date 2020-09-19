import java.util.Scanner;
public class ReadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String output = "";
        System.out.print("Nhập số cần đọc: ");
        int num = input.nextInt();

        if(num<0 || num>999) {
            output = "Ngoài giới hạn";

        } else if(num>=0 && num <=10) {
            switch (num) {
                case 1:
                    output += "một";
                    break;
                case 2:
                    output += "hai";
                    break;
                case 3:
                    output += "ba";
                    break;
                case 4:
                    output += "bốn";
                    break;
                case 5:
                    output += "năm";
                    break;
                case 6:
                    output += "sáu";
                    break;
                case 7:
                    output += "bảy";
                    break;
                case 8:
                    output += "bảy";
                    break;
                case 9:
                    output += "chín";
                    break;
                case 10:
                    output += "mười";
                    break;
            }

        }
        System.out.println(output);
    }
}
