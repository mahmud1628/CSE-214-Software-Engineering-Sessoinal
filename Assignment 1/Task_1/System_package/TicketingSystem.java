package System_package;

import Controller.Controller;
import Internet.Internet;
import Package.Package;
import Web_server.WebServer;

public class TicketingSystem {
    Package pack;
    WebServer webServer;
    Internet internet;

    TicketingSystem(Package pack,WebServer webServer,Internet internet) {
        this.pack = pack;
        this.webServer = webServer;
        this.internet = internet;
    }

    public void print_details() {
        System.out.println("Congratulations! Your system has been built. Here are the details: ");
        System.out.println("Package: " + pack.package_name());
        System.out.println("Microcontroller: " + pack.get_microcontroller().name());
        System.out.println("Display: " + pack.get_display().display_name());
        System.out.println("Identification: " + pack.get_microcontroller().getCard().card_name());
        System.out.println("Internet connection: " + internet.internet_name());
        System.out.println("Storage: " + pack.get_microcontroller().getStorage().storage_name());
        System.out.println("Controller: " + pack.get_controller().controller_name());
        System.out.println("Web server: " + webServer.server_name());
    }
}
