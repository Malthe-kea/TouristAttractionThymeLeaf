package org.example.touristguidethymeleaf.Repository;

import org.example.touristguidethymeleaf.Model.City;
import org.example.touristguidethymeleaf.Model.Tag;
import org.example.touristguidethymeleaf.Model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class TouristAttractionRepository {
    private List<String> tags = new ArrayList<>();
    private List<TouristAttraction> attractionList;

    public TouristAttractionRepository() {
        populateAttractionList();
    }


    public List<TouristAttraction> getAllAttractions() {
        return attractionList;
    }

    public void populateAttractionList() {
        attractionList = new ArrayList<>(List.of(
                new TouristAttraction("Rundetårn", "et højt tårn", City.COPENHAGEN, List.of("Bygning", "Museum", "Seværdighed")),
                new TouristAttraction("Odense Zoo", "Zoologisk have på Fyn", City.ODENSE, List.of("Forlystelse", "Børnevenlig")),
                new TouristAttraction("Sønderborg Slot", "Et slot, der ligger på øen Als i Sønderjylland", City.SOENDERBORG, List.of("Seværdighed", "Børnevenlig")),
                new TouristAttraction("Grenen", "grenen i Skagen er det nordligste punkt i Danmark", City.AALBORG, List.of("Gratis", "Natur")),
                new TouristAttraction("Hammershus", "En rundkirke på øen Bornholm", City.COPENHAGEN, List.of("Kultur", "Seværdighed")),
                new TouristAttraction("Den Gamle By", "En gammel by i Aarhus", City.AARHUS, List.of("Kultur"))
        ));
    }

    public List<String> getTagsByAttractionName(String name) {
        for (TouristAttraction t : attractionList) {
            if (t.getName().equalsIgnoreCase(name) && t.getName() != null) {
                return t.getTags();
            }
        }
        return null;
    }

    public TouristAttraction getTouristAttractionByName(String name) {
        for (TouristAttraction t : attractionList) {
            if (t.getName() != null && t.getName().equalsIgnoreCase(name)) {
                return t;
            }
        }
        return null;
    }

    public void addAttraction(TouristAttraction touristAttraction) {
        attractionList.add(touristAttraction);
    }

    public void updateAttraction(TouristAttraction touristAttraction) {
        for (int i = 0; i < attractionList.size(); i++) {
            TouristAttraction t = attractionList.get(i);
            if (t.getName().equalsIgnoreCase(touristAttraction.getName())) {
                attractionList.set(i, touristAttraction);
                break;
            }
        }
    }

    public void deleteAttraction(TouristAttraction touristAttraction) {
        Iterator<TouristAttraction> iterator = attractionList.iterator();
        while (iterator.hasNext()) {
            TouristAttraction t = iterator.next();
            if (t.getName().equalsIgnoreCase(touristAttraction.getName())) {
                iterator.remove();
            }
        }
    }

}
