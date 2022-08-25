import javax.swing.plaf.IconUIResource;

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ColorPoint extends Point {
    String colour;

    public ColorPoint(int x, int y, String colour) {
        super(x, y);
        this.colour = colour;
    }

    void setXY(int x, int y) {
        move(x, y);
    }

    void setColour(String colour) {
        this.colour = colour;
    }

    public String toString() {
        int x = getX();
        int y = getY();
        return this.colour + "색의 (" + x + ", " + y + ")의 점";
    }
}

public class Week5Q2 {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColour("RED");
        String str = cp.toString();
        System.out.println(str + "입니다.");
    }
}
