package Microcontroller;

import Card.Card;
import Storage.Storage;

import java.util.List;

public abstract class Microcontroller {
    protected Card card;
    protected Storage storage;
    abstract public String name();
    public Card getCard() {
        return this.card;
    }
    public Storage getStorage() {
        return this.storage;
    }
    abstract public List<String> getConnectionSupports();
}
