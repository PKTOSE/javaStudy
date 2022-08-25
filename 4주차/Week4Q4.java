class Calculator {
    int value;

    Calculator() {
        this.value = 0;

    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    void isOdd() {
        if (this.value % 2 == 0) {
            System.out.println(this.value + "은(는) 짝수입니다");

        } else {
            System.out.println(this.value + "은(는) 짝수입니다");
        }
    }
}

public class Week4Q4 {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        calc.add(10);
        calc.isOdd();
    }
}
