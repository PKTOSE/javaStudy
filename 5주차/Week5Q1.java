class SharpPencil {
    int width; // 펜 굵기
    int amount; // 잉크 잔량

    SharpPencil(int amt) {
        this.amount = amt;
    }

    public int getAmount() {
        System.out.println(amount);
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
        System.out.println(amount);

    }
}

class BallPen extends SharpPencil { // 볼펜
    String color;

    BallPen(int amount, String color) {
        super(amount); // 볼펜의 양
        this.color = color; // 볼펜 색
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class FountainPen extends BallPen { // 만년필

    FountainPen(int amount, String color) {
        super(amount, color); // 만년필의 용량, 색
    }

    public void refill(int n) {
        amount += n; // 남은 량 보충
        System.out.println(amount);
    }
}

public class Week5Q1 {
    public static void main(String[] args) {
//        FountainPen ftPen = new FountainPen(30, "Black");
//        ftPen.getColor();
//        ftPen.setAmount(40);
//        ftPen.getAmount();
//        ftPen.refill(3);
    }
}
