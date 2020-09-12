import java.util.Scanner;

public class PrintShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. In hình chữ nhật ");
        System.out.println("2. In 4 hình tam giác vuông");
        System.out.println("3. In hình tam giác cân");
        System.out.println("4. Thoát");
        System.out.println("Bạn chọn gì nào?");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 9; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;


            case 2:
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }

                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j <= 5 - i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;

            case 3:
                String iso = "";
                for (int i = 0; i < 7; i++) {
                    for (int j = 7 - i; j >= 0; j--) {
                        iso += " ";
                    }
                    for (int k = 14 - 2 * i; k < 14; k++) {
                        iso += "*";
                    }
                    iso += "\n";
                }
                System.out.printf(iso);
                break;

            case 0:
                System.out.println("Bye");
                break;
        }
    }
}
