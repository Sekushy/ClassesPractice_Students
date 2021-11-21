package com.company;

public class Presence {
    private Boolean isPresent;
    private String date;

    public Presence(Boolean isPresent, String date) {
        this.isPresent = isPresent;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Presence\nDate: " + this.date + "\nPresence: " + this.isPresent + "\n";
    }
}
