import java.util.ArrayList;
import java.util.Arrays;

class Calculator2 {
    int value;

    Calculator2() {
        this.value = 0;

    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    int avg(int[] data) {
        int sum = Arrays.stream(data).sum();
        int avg = sum / data.length;
        return avg;
    }

    int avg(ArrayList<Integer> data) {
        int sum = 0;
        int cnt = 0;
        for (Integer num : data) {
            sum += num;
            cnt += 1;
        }
        return sum / cnt;
    }
}

public class Week4Q5 {
    public static void main(String[] args) {
        // 정수 배열 사용
        int[] data = {1, 3, 5, 7, 9};
        Calculator2 cal = new Calculator2();
        int result = cal.avg(data);
        System.out.println(result);

        // 정수 리스트 사용
        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        Calculator2 cal2 = new Calculator2();
        int result2 = cal2.avg(data2);
        System.out.println(result2);
    }

}
