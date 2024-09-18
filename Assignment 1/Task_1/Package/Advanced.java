package Package;

import Controller.Controller;
import Controller.SeparateController;
import Display.Display;
import Display.OLED;
import Microcontroller.Microcontroller;
import Microcontroller.Raspberry;

public class Advanced extends Package{
    public Advanced() {
        this.microcontroller = new Raspberry();
        this.display = new OLED();
        this.controller = new SeparateController();
    }
    @Override
    public String package_name() {
        return "Advanced";
    }
}
