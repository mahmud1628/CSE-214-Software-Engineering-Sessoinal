package Controller;

public class ControllerFactory {
    public Controller get_controller(String type) {
        if(type.equalsIgnoreCase("integrated")) {
            return new IntegratedController();
        }
        else if(type.equalsIgnoreCase("separate")) {
            return new SeparateController();
        }
        else {
            return null;
        }
    }
}
