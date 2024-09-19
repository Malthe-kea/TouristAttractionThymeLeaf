package org.example.touristguidethymeleaf.Service;

import org.example.touristguidethymeleaf.Model.Tag;
import org.example.touristguidethymeleaf.Model.TouristAttraction;
import org.example.touristguidethymeleaf.Repository.TouristAttractionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristAttractionService {

    private TouristAttractionRepository touristAttractionRepository;
    public TouristAttractionService(TouristAttractionRepository touristAttractionRepository) {
        this.touristAttractionRepository = touristAttractionRepository;
    }

    public List<TouristAttraction> getAllAttractions(){
        return touristAttractionRepository.getAllAttractions();
    }

    public List<Tag> getTagsByAttractionName(String name){
        return touristAttractionRepository.getTagsByAttractionName(name);
    }

    public TouristAttraction getAttractionByName(String name){
        return touristAttractionRepository.getTouristAttractionByName(name);
    }

    public void addAttraction(TouristAttraction touristAttraction){
        touristAttractionRepository.addAttraction(touristAttraction);
    }

    public void updateAttraction(TouristAttraction touristAttraction){
        touristAttractionRepository.updateAttraction(touristAttraction);
    }

    public void deleteAttraction(TouristAttraction touristAttraction){
        touristAttractionRepository.deleteAttraction(touristAttraction);
    }
}
