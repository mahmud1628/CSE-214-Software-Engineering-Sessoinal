package Internet;

public class Internet_factory {
    public Internet get_internet(String type) {
        if(type.equalsIgnoreCase("ethernet")) {
            return new Ethernet();
        }
        else if(type.equalsIgnoreCase("gsm")) {
            return new GSM();
        }
        else if(type.equalsIgnoreCase("wifi")) {
            return new Wifi();
        }
        else {
            return null;
        }
    }
}
