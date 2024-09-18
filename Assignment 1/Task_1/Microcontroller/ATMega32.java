package Microcontroller;

import Card.Card;
import Card.RFID;
import Storage.SDcard;
import Storage.Storage;

import java.util.ArrayList;
import java.util.List;

public class ATMega32 extends Microcontroller{

    public ATMega32() {
        this.card = new RFID();
        this.storage = new SDcard();
    }
    @Override
    public String name() {
        return "ATMega32";
    }
    @Override
    public List<String> getConnectionSupports() {
        List<String> list = new ArrayList<>();
        list.add("Wifi");
        list.add("GSM");
        return list;
    }
}
