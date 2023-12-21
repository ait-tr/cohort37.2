public class Purchase {
    private int quantity;
    private Item item;

    public Purchase(int quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "quantity=" + quantity +
                ", item=" + item +
                '}';
    }


    public double calcPrice(){

        return item.buy() * quantity;
    }

    public void buy(){
        System.out.println("количество: " + quantity + " цена: " +calcPrice());
    }


}
