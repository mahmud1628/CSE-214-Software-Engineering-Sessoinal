import java.util.List;

public class SingleItem extends FoodItem{

    public SingleItem(String name,double price) {
        super(name,price);
    }

    @Override
    public void printDetails() {
        System.out.print(this.getName() + " - " + this.getPrice() + "tk");
    }

    @Override
    public Item getItem(int i) {
        return null;
    }

    @Override
    public void addItem(Item item) {
        // nothing to do
    }

    @Override
    public void removeItem(Item item) {
        // nothing to do
    }

    @Override
    public void printItem() {
        System.out.print(this.getName());
    }

    @Override
    public Item getItem(String name) {
        return null;
    }

    @Override
    public double discountedPrice() {
        return this.getPrice();
    }

    @Override
    public double getDiscount() {
        return 0;
    }

    @Override
    public void setDiscount(double discount) {

    }

    @Override
    public void addFreeItem(Item item) {
        // nothing to do
    }

    @Override
    public List<Item> getItems() {
        return null;
    }

    @Override
    public List<Item> getFreeItems() {
        return null;
    }
}
