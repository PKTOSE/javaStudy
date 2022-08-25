import java.util.Scanner;

public class Week5Q4 {
    public static void main(String[] args) {
        while (true) {
            String str = "END";
            Scanner scanner = new Scanner(System.in);
            System.out.print("영어 문장을 입력하세요>>");
            str = scanner.nextLine();
            str = str.toUpperCase();
            System.out.println(str);
            if (str.equals("END")) {
                break;
            }
        }
    }
}
