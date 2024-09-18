package Web_server;

public class Web_factory {
    public WebServer get_webserver(String name) {
        if(name.equalsIgnoreCase("django")) {
            return new Django();
        }
        else if(name.equalsIgnoreCase("nodejs")) {
            return new NodeJS();
        }
        else if(name.equalsIgnoreCase("ruby")) {
            return new Ruby();
        }
        else {
            return null;
        }
    }
}
