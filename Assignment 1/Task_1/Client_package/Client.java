package Client_package;

import System_package.Director;
import System_package.TicketingSystem;
import System_package.TicketingSystemBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Client_helper {

    List<String> package_types = new ArrayList<>();
    List<String> connection_types = new ArrayList<>();
    List<String> server_types = new ArrayList<>();
    protected Client_helper() {
        package_types.add("basic");
        package_types.add("standard");
        package_types.add("advanced");
        package_types.add("premium");

        connection_types.add("wifi");
        connection_types.add("gsm");
        connection_types.add("ethernet");

        server_types.add("django");
        server_types.add("nodejs");
        server_types.add("ruby");
    }
    protected void print_packages() {
        System.out.println("Welcome to our company. \nPlease select a package that best suits your needs. Here are the details of our package: ");
        System.out.println("1. Basic: It consists of ATMega32 microcontroller and LCD display. ");
        System.out.println("2. Standard: It consists of Arduino Mega and LED display.");
        System.out.println("3. Advanced: It consists of Raspberry and OLED display");
        System.out.println("4. Premium: It consists of Raspberry and touch screen");
        System.out.print("Please enter the corresponding number of a package to select it: ");
    }
}

public class Client {

    public static void main(String[] args) {
        Client_helper clientHelper = new Client_helper();
        Director director = new Director();
        TicketingSystemBuilder ticketingSystemBuilder = new TicketingSystemBuilder();
        Scanner scanner = new Scanner(System.in);
        // Package details
        clientHelper.print_packages();
        // Package input
        int p = scanner.nextInt();
        while(p < 0 || p > 4) {
            System.out.print("Please enter a number between 1 to 4 to select the corresponding package: ");
            p = scanner.nextInt();
        }
        director.addPackage(ticketingSystemBuilder,clientHelper.package_types.get(p-1));
        // Internet connection details
        System.out.println("\nThe microcontroller of your selected package supports the following connections: ");
        int i = 1;
        for(var s : ticketingSystemBuilder.get_pack().get_microcontroller().getConnectionSupports()) {
            System.out.println(i + ". " + s);
            i++;
        }
        i--;
        // Internet connection input
        System.out.print("Please select a number between 1 and " + i + " to select the corresponding connection: ");
        int c = scanner.nextInt();
        while(c < 0 || c > i) {
            System.out.print("Please select a number between 1 and " + i + " to select the corresponding connection: ");
            c = scanner.nextInt();
        }

        director.addInternet(ticketingSystemBuilder,clientHelper.connection_types.get(c-1));
        // Server details
        System.out.println("\nWe offer you the following servers: \n1. Django \n2. NodeJS\n3. Ruby");
        // Server input
        System.out.print("Please select a number between 1 and 3 to select the corresponding server: ");
        int s = scanner.nextInt();
        while(s < 0 || s > 3) {
            System.out.print("Please select a number between 1 and 3 to select the corresponding server: ");
            s = scanner.nextInt();
        }
        director.addServer(ticketingSystemBuilder,clientHelper.server_types.get(s-1));
        // Build system
        TicketingSystem ticketingSystem = ticketingSystemBuilder.build();
        System.out.print("\n\n");
        ticketingSystem.print_details();
    }
}
