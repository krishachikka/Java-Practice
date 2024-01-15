public class ChocolateThis {
    private int barcode;
    private String name;
    private int weight;
    private int cost;

    ChocolateThis(){
        this.barcode = 101;
        this.name = "Cadbury";
        this.weight = 12;
        this.cost = 10;
    }

    public int getBarCode() {
        return barcode;
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    public int getCost() {
        return cost;
    }
    
    public void setBarcode(int barcode){
        this.barcode = barcode;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setCost(int cost){
        this.cost = cost;
    }

    public static void main(String[] args) {
        Chocolate c = new Chocolate();
        System.out.println(c.getBarCode());
        System.out.println(c.getName());
        System.out.println(c.getWeight());
        System.out.println(c.getCost());

        c.setBarcode(102);
        c.setName("Hershey's");
        c.setWeight(24);
        c.setCost(50);

        System.out.println("Modified:");
        System.out.println(c.getBarCode());
        System.out.println(c.getName());
        System.out.println(c.getWeight());
        System.out.println(c.getCost());

    }
}
// OUTPUT
// 101
// Cadbury
// 12
// 10
// Modified:
// 102
// Hershey's
// 24
// 50