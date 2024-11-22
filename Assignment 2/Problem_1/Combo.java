import java.util.ArrayList;
import java.util.List;

public class Combo extends FoodItem{
    private List<Item> items;
    private List<Item> freeItems;
    private double discount;

    public Combo(String name) {
        super(name,0);
        items = new ArrayList<Item>();
        freeItems = new ArrayList<Item>();
        discount = 0;
    }

    @Override
    public void removeItem(Item item) {
        for(Item it : items) {
            if(item.getName().equalsIgnoreCase(it.getName())) {
                items.remove(it);
                return;
            }
        }
        for(Item it : freeItems) {
            if(item.getName().equalsIgnoreCase(it.getName())) {
                freeItems.remove(it);
                return;
            }
        }
    }

    @Override
    public void addItem(Item item) {
        items.add(item);
    }


    @Override
    public void addFreeItem(Item item) {
        freeItems.add(item);
    }

    @Override
    public Item getItem(String name) {
        for(Item item : items) {
            if(item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        for(Item item : freeItems) {
            if(item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public Item getItem(int i) {
        return items.get(i);
    }

    @Override
    public double getPrice() {
        double prc = 0;
        for(Item item : items) {
            prc += item.discountedPrice();
        }
        return prc;
    }

    @Override
    public double discountedPrice() {
        return this.getPrice() * (1 - discount/100);
    }

    @Override
    public double getDiscount() {
        return this.discount;
    }

    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public void printItem() {
        System.out.print(this.getName() + "(");
        for(int i = 0 ;i < items.size() ;i++) {
            this.items.get(i).printItem();
            if(i != items.size() - 1) {
                System.out.print(" + ");
            }
            if(i == items.size() - 1 && !freeItems.isEmpty()) {
                System.out.print(" + ");
            }
        }
        for(int i=0;i<freeItems.size();i++) {
            this.freeItems.get(i).printItem();
            System.out.print("(Free!!!)");
            if(i != freeItems.size() - 1) {
                System.out.print(" + ");
            }
        }
        System.out.print(")");
    }

    @Override
    public void printDetails() {
        this.printItem();
        System.out.print(" - " + this.discountedPrice() + "tk");
        if(discount != 0) {
            System.out.print("(Total price: " + getPrice() + " , Discount: " + getDiscount() + "%)");
        }
    }

    @Override
    public List<Item> getItems() {
        return items;
    }

    @Override
    public List<Item> getFreeItems() {
        return freeItems;
    }
}
