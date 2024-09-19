package org.example.touristguidethymeleaf.Model;

import java.util.List;
import java.util.UUID;

public class TouristAttraction {
    private String name;
    private String description;
    private UUID id;
    private List<String> tag;
    private City city;


    public void setTag(List<String> tag) {
        this.tag = tag;
    }

    public TouristAttraction(String name, String description, City city, List<String> tag){
        this.name = name;
        this.description = description;
        this.id = id;
        this.tag = tag;
        this.city = city;
    }

    public TouristAttraction() {
        if(id == null){
            this.id = UUID.randomUUID();
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getTag() {
        return tag;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    public List<String> getTags() {
        return tag;
    }
}
