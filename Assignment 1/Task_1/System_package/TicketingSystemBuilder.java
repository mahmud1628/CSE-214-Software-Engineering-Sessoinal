package System_package;

import Controller.Controller;
import Internet.Internet;

import Web_server.WebServer;
import Package.Package;


public class TicketingSystemBuilder {
    private Package pack;
    private WebServer webServer;
    private Internet internet;

    private Controller controller;

    public void set_pack(Package pack) {
        this.pack = pack;
    }
    public void set_webServer(WebServer webServer) {
        this.webServer = webServer;
    }
    public void set_internet(Internet internet) {
        this.internet = internet;
    }

    public Package get_pack() {
        return this.pack;
    }
    public TicketingSystem build() {
        return new TicketingSystem(this.pack,this.webServer,this.internet);
    }
}
