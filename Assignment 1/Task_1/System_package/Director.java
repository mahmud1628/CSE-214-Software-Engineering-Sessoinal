package System_package;

import Package.Package_factory;
import Internet.Internet_factory;
import Web_server.Web_factory;

public class Director {
    Package_factory packageFactory = new Package_factory();
    Internet_factory internetFactory = new Internet_factory();
    Web_factory webFactory = new Web_factory();
    public void addPackage(TicketingSystemBuilder ticketingSystemBuilder,String type) {
        ticketingSystemBuilder.set_pack(packageFactory.get_package(type));
    }
    public void addInternet(TicketingSystemBuilder ticketingSystemBuilder,String type) {
        ticketingSystemBuilder.set_internet(internetFactory.get_internet(type));
    }
    public void addServer(TicketingSystemBuilder ticketingSystemBuilder,String server) {
        ticketingSystemBuilder.set_webServer(webFactory.get_webserver(server));
    }
}
