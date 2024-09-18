package Package;

import Display.Display;
import Microcontroller.Microcontroller;
import Controller.Controller;

public abstract class Package {
    protected Microcontroller microcontroller;
    protected Display display;
    protected Controller controller;
    public Microcontroller get_microcontroller() {
        return this.microcontroller;
    }
    public Display get_display() {
        return this.display;
    }
    abstract public String package_name();
    public Controller get_controller() {
        return this.controller;
    }
}
