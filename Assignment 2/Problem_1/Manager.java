import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        // Menu
        Menu menu = new Menu();

        // Add single items to menu
        menu.addItem(new SingleItem("Burger",300));
        menu.addItem(new SingleItem("Fries",100));
        menu.addItem(new SingleItem("Wedges",150));
        menu.addItem(new SingleItem("Shawarma",200));
        menu.addItem(new SingleItem("Drink",25));
        // combo1
        Item combo1 = new Combo("Combo1");
        combo1.addItem(new SingleItem("Burger",300));
        combo1.addItem(new SingleItem("Fries",100));
        combo1.addItem(new SingleItem("Drink",25));


        // combo2
        Item combo2 = new Combo("Combo2");
        combo2.addItem(new SingleItem("Shawarma",200));
        combo2.addItem(new SingleItem("Drink",25));

        // Add combo to the menu
        menu.addItem(combo1);
        menu.addItem(combo2);

        // show menu
        menu.viewMenu();

        int option = -1;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Press 1 to create a combo,2 to view menu and 0 to exit: ");
            option = scanner.nextInt();
            while(option < 0 || option > 2) {
                System.out.println("Press 1 to create a combo,2 to view menu and 0 to exit: ");
                option = scanner.nextInt();
            }

            if(option == 1) {
                menu.createCombo();
            } else if(option == 2) {
                menu.viewMenu();
            } else {
                break;
            }
        }
    }
}
