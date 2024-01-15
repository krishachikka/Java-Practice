public class Chocolate {
    private int barcode;
    private String name;
    private int weight;
    private int cost;

    Chocolate(){
        barcode = 101;
        name = "Cadbury";
        weight = 12;
        cost = 10;
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
    
    public void setBarcode(int code){
        barcode = code;
    }
    public void setName(String Name){
        name = Name;
    }
    public void setWeight(int wgt){
        weight = wgt;
    }
    public void setCost(int Cost){
        cost = Cost;
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