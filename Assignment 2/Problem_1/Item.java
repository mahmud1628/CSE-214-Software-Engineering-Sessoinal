import java.util.List;

public interface Item {
    public String getName();
    public double getPrice();
    public double discountedPrice();
    public double getDiscount();
    public void setDiscount(double discount);
    public void addItem(Item item);
    public void addFreeItem(Item item);
    public void removeItem(Item item);
    public Item getItem(int i);
    public Item getItem(String name);
    public void printDetails();
    public void printItem();
    public List<Item> getItems();
    public List<Item> getFreeItems();
}
