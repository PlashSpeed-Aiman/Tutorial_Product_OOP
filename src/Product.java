public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String initialName, double initialPrice, int initialQuantity){
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }
    //getter and setter
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public void setQuantity(int newQuantity){
        this.quantity = newQuantity;
    }

    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }
    @Override
    public String toString() {
        return String.format("%s,%.2f,%d", this.name, this.price, this.quantity);
    }
}
