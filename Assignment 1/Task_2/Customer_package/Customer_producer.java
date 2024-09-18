package Customer_package;

public class Customer_producer { // Factory Producer
    public Customer get_customer(String type) {
        if(type.equalsIgnoreCase("regular")) {
            return new Regular_customer();
        }
        else if(type.equalsIgnoreCase("premium")) {
            return new Premium_customer();
        }
        else if(type.equalsIgnoreCase("vip")) {
            return new VIP_customer();
        }
        else {
            return null;
        }
    }
}
