public class Product {
    String headphones;
    String batteryTime;
    String waterproof;
    String price;

    public Product(String headphones, String battery, String waterproof, String price){
        this.headphones=headphones;
        this.batteryTime =battery;
        this.waterproof=waterproof;
        this.price=price;
    }
    public String toString(){
        return "! " + this.headphones + " - " + this.batteryTime + " - " + this.waterproof + " - " + this.price;
    }

    public String toSmallString(){
        return  this.headphones + " - " + this.price;
    }
}