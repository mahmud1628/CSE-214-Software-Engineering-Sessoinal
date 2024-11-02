import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Item> menuItems;

    Scanner scanner;

    public Menu() {
        menuItems = new ArrayList<Item>();
        scanner = new Scanner(System.in);
    }

    public void addItem(Item item) {
        menuItems.add(item);
    }

    public void removeItem(Item item) {
        menuItems.remove(item);
    }

    public void createCombo() {
        System.out.print("Enter the name of the combo: ");
        String comboName = scanner.nextLine();
        Item newCombo = new Combo(comboName);

        showCommands();

        String command;

        while(true) {
            command = scanner.nextLine();
            if(command.equalsIgnoreCase("Done")) {
                // complete combo creation and show the created combo
                if(newCombo.getItems().isEmpty()) {
                    System.out.println("No combo created");
                    return;
                }
                addItem(newCombo);
                System.out.println("Your combo:");
                System.out.println(newCombo.getName());
                List<Item> items = newCombo.getItems();
                List<Item> freeItems = newCombo.getFreeItems();
                for(Item item : items) {
                    System.out.print("   - " );
                    item.printItem();
                    System.out.print("\n");
                }
                for(Item item : freeItems) {
                    System.out.print("   - " );
                    item.printItem();
                    System.out.print("(Free!!!)\n");
                }
                System.out.println("Total - " + newCombo.getPrice());
                System.out.println("Discount - " + newCombo.getDiscount() + "%");
                System.out.println("Discounted total - " + newCombo.discountedPrice());
                return;
            } else {
                String [] commandArr = command.split(" ");
                if(commandArr.length != 2) {
                    System.out.println("Invalid command");
                    continue;
                }
                String cmd = commandArr[0];
                String name = commandArr[1];
                if(cmd.equalsIgnoreCase("add")) {
                    Item item = getMenuItem(name);
                    if(item == null) {
                        System.out.println("Invalid item");
                    } else {
                        newCombo.addItem(item);
                        System.out.println("Item added");
                    }
                } else if(cmd.equalsIgnoreCase("remove")) {
                    Item item = newCombo.getItem(name);
                    if(item == null) {
                        System.out.println("Item never added");
                    } else {
                        newCombo.removeItem(item);
                        System.out.println("Item removed");
                    }
                } else if(cmd.equalsIgnoreCase("free")) {
                    Item item = getMenuItem(name);
                    if(item == null) {
                        System.out.println("Invalid item");
                    } else {
                        newCombo.addFreeItem(item);
                        System.out.println("Free item added");
                    }
                } else if(cmd.equalsIgnoreCase("discount")) {
                    newCombo.setDiscount(Double.parseDouble(name));
                    System.out.println("Discount Added");
                } else {
                    System.out.println("Invalid command");
                }
            }

        }

    }

    private void showCommands() {
        System.out.println("\nAvailable commands:");
        System.out.println("Add [item]");
        System.out.println("Remove [item]");
        System.out.println("Free [item]");
        System.out.println("Discount [precentage]");
        System.out.println("Done");
    }

    public void addFreeItem(String comboName, Item freeItem) {

    }

    public void viewMenu() {
        System.out.println("\nMenu:");
        for(Item item : menuItems) {
            item.printDetails();
            System.out.print("\n");
        }
        System.out.println();
    }

    public Item getMenuItem(int i) {
        return menuItems.get(i);
    }

    public Item getMenuItem(String name) {
        for(Item item : menuItems) {
            if(item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }
}
