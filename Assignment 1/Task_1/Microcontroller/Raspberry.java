package Microcontroller;

import Card.Card;
import Card.NFC;
import Storage.Integrated;
import Storage.Storage;

import java.util.ArrayList;
import java.util.List;

public class Raspberry extends Microcontroller{
    public Raspberry() {
        this.card = new NFC();
        this.storage = new Integrated();
    }
    @Override
    public String name() {
        return "Raspberry Pi";
    }
    @Override
    public List<String> getConnectionSupports() {
        List<String> list = new ArrayList<>();
        list.add("Wifi");
        list.add("GSM");
        list.add("Ethernet");
        return list;
    }
}
