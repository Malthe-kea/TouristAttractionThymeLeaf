package org.example.touristguidethymeleaf.Model;

public enum Tag {

    HISTORIC("Historic"),
    MUSEUM("Museum"),
    PARK("Park"),
    BEACH("Beach"),
    MOUNTAIN("Mountain"),
    RESTAURANT("Restaurant"),
    SHOPPING("Shopping"),
    ADVENTURE("Adventure"),
    CULTURE("Culture"),
    NATURE("Nature");

    private final String tag;

    Tag(String tag) {
        this.tag = tag;
    }

    public String displayTag() {
        return tag;
    }
}
