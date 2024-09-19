package org.example.touristguidethymeleaf.Model;

public enum Tag {

    BØRNEVENLIG("Børnevenlig"),
    KUNST("Kunst"),
    GRATIS("Gratis"),
    NATUR("Natur"),
    HISTORISK("Historisk"),
    UDENDØRS("Udendørs"),
    INDENDØRS("Indendørs"),
    MUSEUM("Museum"),
    STRAND("Strand"),
    AKTIVITET("Aktivitet"),
    UDSIGT("Udsigt"),
    ARKITEKTUR("Arkitektur"),
    RESTAURANT("Restaurant"),
    SHOPPING("Shopping"),
    FORLYSTELSESPARK("Forlystelsespark"),
    NATIONALPARK("Nationalpark"),
    SLOT("Slot"),
    KIRKE("Kirke"),
    HAVN("Havn"),
    SEVÆRDIGHED("Seværdighed"),
    VANDRING("Vandring"),
    CYKELVENLIG("Cykelvenlig"),
    PARKERING("Parkering"),
    GUIDETTURE("Guidede ture"),
    LOKALKULTUR("Lokal kultur"),
    FAMILIEVENLIG("Familievenlig"),
    KONCERTER("Koncerter"),
    TEATER("Teater"),
    MADMARKED("Madmarked"),
    NATKLUB("Natklub"),
    ØKOLOGISK("Økologisk"),
    FESTIVAL("Festival"),
    CAMPING("Camping"),
    BYPARK("Bypark"),
    ZOOLOGISKHAVE("Zoologisk have"),
    FORLYSTELSER("Forlystelser"),
    AKVARIUM("Akvarium"),
    DYREVENLIG("Dyrevenlig"),
    GRØNNEOMRÅDER("Grønne områder"),
    BADELAND("Badeland"),
    SKOV("Skov"),
    GÅGADER("Gågader"),
    HAVNEPROMENADE("Havnepromenade"),
    EVENTYR("Eventyr"),
    KANO("Kano"),
    VANDSPORT("Vandsport"),
    ROLLESPIL("Rollespil"),
    HAVKAJAK("Havkajak"),
    OPLEVELSESZONER("Oplevelseszoner"),
    VIDENSKAB("Videnskab"),
    BIOGRAF("Biograf"),
    ADVENTURE("Adventure"),
    FOTOGRAFERING("Fotografering"),
    GEOKACHING("Geokaching"),
    GASTRONOMI("Gastronomi"),
    VINGÅRD("Vingård"),
    ØLBAR("Ølbar"),
    KAFFEBAR("Kaffebar"),
    KULTURARV("Kulturarv"),
    UDSTILLING("Udstilling");

    private final String tag;

    Tag(String tag) {
        this.tag = tag;
    }

    public String displayTag() {
        return tag;
    }
}
