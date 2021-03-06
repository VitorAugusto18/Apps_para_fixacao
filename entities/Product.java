package entities;

public class Product {
    
    public String name;
    public double price;
    public int quantity;
    
    public double totalValueInStock(){
        double result = price * quantity;
        return result;
    }
    public void addProduct(int quantity){
        this.quantity += quantity;
    }
    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name
                + ", R$"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " unidades, Total: R$"
                + String.format("%.2f",totalValueInStock());
    } 
}
