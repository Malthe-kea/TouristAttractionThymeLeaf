package org.example.touristguidethymeleaf.Controller;

import org.example.touristguidethymeleaf.Model.City;
import org.example.touristguidethymeleaf.Model.Tag;
import org.example.touristguidethymeleaf.Model.TouristAttraction;
import org.example.touristguidethymeleaf.Service.TouristAttractionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.InvalidObjectException;
import java.util.Arrays;

@Controller()
@RequestMapping("")
public class TouristAttractionController {

    private TouristAttractionService touristAttractionService;

    public TouristAttractionController(TouristAttractionService touristAttractionService) {
        this.touristAttractionService = touristAttractionService;
    }

    @GetMapping("")
    public String showListOfAttractions(Model model) {
        model.addAttribute("attractions", touristAttractionService.getAllAttractions());
        return "attraction-list";
    }

    @GetMapping("attractions/{name}")
    public String getAttractionByName(@PathVariable String name, Model model) {
        TouristAttraction touristAttraction = touristAttractionService.getAttractionByName(name);
        model.addAttribute("touristAttraction", touristAttraction);
        return "attraction-list";
    }

    @GetMapping("attractions/{name}/tag")
    public String getTagsByAttractionName(@PathVariable String name, Model model) {
        TouristAttraction touristAttraction = touristAttractionService.getAttractionByName(name);
        model.addAttribute("tagList", touristAttractionService.getTagsByAttractionName(name));
        model.addAttribute("touristAttraction", touristAttraction.getName());
        model.addAttribute("tag", touristAttraction.getTags());
        return "tags-list";

    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        TouristAttraction touristAttraction = new TouristAttraction();
        model.addAttribute("touristAttraction", touristAttraction);
        model.addAttribute("city", City.values());
        model.addAttribute("tag", Tag.values());
        return "add-attraction-form";
    }

    @PostMapping("/save")
    public String addAttraction(@ModelAttribute TouristAttraction touristAttraction) {
        if (touristAttraction.getName() != "" || touristAttraction.getDescription() != "") {
            touristAttractionService.addAttraction(touristAttraction);
        }
        return "redirect:/";
    }

    @GetMapping("attractions/{name}/edit")
    public String showEditTouristAttractionForm(TouristAttraction touristAttraction, Model model) {
        TouristAttraction t = touristAttractionService.getAttractionByName(touristAttraction.getName());
        if (t == null) {
            throw new IllegalArgumentException("Invalid attraction name");
        }

        t.getTags();
        model.addAttribute("touristAttraction", t);
        model.addAttribute("city", City.values());
        model.addAttribute("tag", Tag.values());
        model.addAttribute("description", t);
        return "edit-attraction-form";
    }

    @PostMapping("attractions/update")
    public String saveEditAttractionForm(TouristAttraction touristAttraction) {
        touristAttractionService.updateAttraction(touristAttraction);
        return "redirect:/";
    }

    @GetMapping("attractions/{name}/delete")
    public String getAttractionToDelete(@PathVariable String name, Model model) {
        TouristAttraction t = touristAttractionService.getAttractionByName(name);
        model.addAttribute("attraction", t);
        return "delete-attraction";
    }


    @PostMapping("attractions/delete")
    public String deleteTouristAttraction(@RequestParam String name) {
        TouristAttraction t = touristAttractionService.getAttractionByName(name);
        if (t != null) {
            touristAttractionService.deleteAttraction(t);
        }
        return "redirect:/";
    }


}
