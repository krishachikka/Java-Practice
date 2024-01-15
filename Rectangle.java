public class Rectangle {
    private int length;
    private int breadth;

    public void setLength(int length){
        this.length = length;
    }
    public void setBreadth(int breadth){
        this.breadth = breadth;
    }
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.setLength(10);
        obj.setBreadth(20);
    }
}