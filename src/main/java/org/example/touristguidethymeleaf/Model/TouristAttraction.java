package org.example.touristguidethymeleaf.Model;

import java.util.List;
import java.util.UUID;

public class TouristAttraction {
    private String name;
    private String description;
    private UUID id;
    private List<Tag> tag;
    private City city;
    private Boolean isFree;


    public void setTag(List<Tag> tag) {
        this.tag = tag;
    }

    public TouristAttraction(String name, String description, City city, List<Tag> tag, boolean isFree){
        this.name = name;
        this.description = description;
        this.id = id;
        this.tag = tag;
        this.city = city;
        this.isFree = isFree;
    }

    public TouristAttraction() {
        if(id == null){
            this.id = UUID.randomUUID();
        }
    }

    public String getName() {
        return name;
    }

    public List<Tag> getTag() {
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
    public List<Tag> getTags() {
        return tag;
    }

    public Boolean getFree() {
        return isFree;
    }

    public void setFree(Boolean free) {
        isFree = free;
    }
}
