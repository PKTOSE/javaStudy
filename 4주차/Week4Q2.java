import java.util.Scanner;

class Grade {
    private int math;
    private int science;
    private int eng;

    Grade(int mScore, int sScore, int eScore) {
        this.math = mScore;
        this.science = sScore;
        this.eng = eScore;
    }

    public String average() {
        int sum;
        sum = this.math + this.science + this.eng;
        String avg = Integer.toString(sum / 3);

        return avg;
    }
}

public class Week4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 " + me.average());

        scanner.close();
    }
}
