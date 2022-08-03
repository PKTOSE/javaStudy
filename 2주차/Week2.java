import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Week2 {
    public static void main(String[] args) {
        // 3장 연습문제
        // Q1
        int kor = 80;
        int eng = 75;
        int math = 55;
        String avg = "" + (kor + eng + math)/3;
        System.out.println(avg);

        //Q3
        String joomin = "881120-1068234";
        System.out.println(joomin.substring(0,6)+" and "+joomin.substring(7,14));

        //Q5
        String a = "a:b:c:d";
        System.out.println(a.replace(":","#"));

        //Q7
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = String.join(" ", myList);
        System.out.println(result);

        //Q9
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet<Integer> result2 = new HashSet<>(numbers);
        ArrayList<Integer> setNumbers = new ArrayList<>(result2);
        System.out.println(setNumbers);
    }
}
