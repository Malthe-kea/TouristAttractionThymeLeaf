package org.example.touristguidethymeleaf.Model;

public enum City {
    COPENHAGEN("Copenhagen"),
    AARHUS("Aarhus"),
    ODENSE("Odense"),
    AALBORG("Aalborg"),
    ESBJERG("Esbjerg"),
    RANDERS("Randers"),
    KOLDING("Kolding"),
    HORSENS("Horsens"),
    Vejle("Vejle"),
    ROSKILDE("Roskilde"),
    HERNING("Herning"),
    HILLEROD("Hillerød"),
    HELSINGOR("Helsingør"),
    SILKEBORG("Silkeborg"),
    NAESTVED("Næstved"),
    SLAGELSE("Slagelse"),
    FREDERICIA("Fredericia"),
    SOENDERBORG("Sønderborg"),
    HOLSTEBRO("Holstebro"),
    TAASTRUP("Taastrup"),
    HORSOLM("Hørsholm"),
    SKIVE("Skive"),
    KOEGE("Køge"),
    SORO("Sorø"),
    RINGSTED("Ringsted");

    private final String city;

    // Constructor
    City(String city) {
        this.city = city;
    }

    // Getter method
    public String getCity() {
        return city;
    }
}
