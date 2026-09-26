public class Item {
    String itemName;
    int stock;
    public Item(String itemName, int stock) {
        this.itemName = itemName;
        this.stock = stock;
    }
    void restock(int stock) {
        this.stock = this.stock + stock;
    }
}