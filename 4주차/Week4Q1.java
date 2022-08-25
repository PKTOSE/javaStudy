class TV {
    private String brand;
    private int year;
    private int sizeOfScreen; // 인치

    TV(String brand, int year, int size) {
        this.brand = brand;
        this.year = year;
        this.sizeOfScreen = size;
    }


    public void show() {
        System.out.println(this.brand + "에서 만든 " + this.year + "년형 " + this.sizeOfScreen + "인치 TV");
    }

}

public class Week4Q1 {
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}
