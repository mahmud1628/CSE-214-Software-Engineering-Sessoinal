package Package;

import Controller.SeparateController;
import Controller.Controller;
import Display.Display;
import Display.LCD;
import Microcontroller.Microcontroller;
import Microcontroller.ATMega32;

public class Basic extends Package{
    public Basic() {
        this.microcontroller = new ATMega32();
        this.display = new LCD();
        this.controller = new SeparateController();
    }
    @Override
    public String package_name() {
        return "Basic";
    }
}
