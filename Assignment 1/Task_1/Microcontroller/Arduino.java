package Microcontroller;

import Card.Card;
import Card.RFID;
import Storage.SDcard;
import Storage.Storage;

import java.util.ArrayList;
import java.util.List;

public class Arduino extends Microcontroller{
    public Arduino() {
        this.card = new RFID();
        this.storage = new SDcard();
    }
    @Override
    public String name() {
        return "Arduino Mega";
    }

    @Override
    public List<String> getConnectionSupports() {
        List<String> list = new ArrayList<>();
        list.add("Wifi");
        list.add("GSM");
        return list;
    }
}
