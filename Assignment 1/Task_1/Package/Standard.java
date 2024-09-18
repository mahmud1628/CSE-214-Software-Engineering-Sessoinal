package Package;

import Controller.Controller;
import Controller.SeparateController;
import Display.Display;
import Display.LED;
import Microcontroller.Microcontroller;
import Microcontroller.Arduino;

public class Standard extends Package{
    public Standard() {
        this.controller = new SeparateController();
        this.microcontroller = new Arduino();
        this.display = new LED();
    }

    @Override
    public String package_name() {
        return "Standard";
    }
}
