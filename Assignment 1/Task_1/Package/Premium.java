package Package;

import Controller.Controller;
import Controller.IntegratedController;
import Display.Display;
import Display.TouchScreen;
import Microcontroller.Microcontroller;
import Microcontroller.Raspberry;

public class Premium extends Package{
    public Premium() {
        this.controller = new IntegratedController();
        this.microcontroller = new Raspberry();
        this.display = new TouchScreen();
    }
    @Override
    public String package_name() {
        return "Premium";
    }
}
