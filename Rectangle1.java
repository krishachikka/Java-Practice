public class Rectangle1 {
    private int length;
    private int breadth;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void calcPerimeter() {
        int peri = 2 * (length + breadth);
        System.out.println("Perimeter = " + peri);
    }
}
class PerimeterCalculator {
    public static void main(String[] args) {
        Rectangle1 obj = new Rectangle1();
        obj.setLength(10);
        obj.setBreadth(20);
        obj.calcPerimeter();
    }
}
