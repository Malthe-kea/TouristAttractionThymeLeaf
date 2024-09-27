package org.example.touristguidethymeleaf.Controller;

import org.example.touristguidethymeleaf.Model.Tag;
import org.example.touristguidethymeleaf.Model.TouristAttraction;
import org.example.touristguidethymeleaf.Service.TouristAttractionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


import java.util.Arrays;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(TouristAttractionController.class)
class TouristAttractionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TouristAttractionService touristAttractionService;

    @BeforeEach
    public void setUp(){
        TouristAttraction t = new TouristAttraction();
        t.setName("Spanien");
        t.setTags(Arrays.asList(Tag.RESTAURANT,Tag.HISTORIC));

        when(touristAttractionService.getAttractionByName("Spanien")).thenReturn(t);
    }

    @Test
    void showListOfAttractions()  throws Exception {
        mockMvc.perform(get(""))
                .andExpect(status().isOk())
                .andExpect(view().name("attraction-list"));
    }

    @Test
    void getTagsByAttractionName() throws Exception{
        mockMvc.perform(get("/attractions/Spanien/tag"))
                .andExpect(status().isOk())
                .andExpect(view().name("tags-list"))
                .andExpect(content()
                        .string(containsString("Attractions")));
    }

    @Test
    void createTouristAttraction() throws Exception {
        mockMvc.perform(get("/add"))
                .andExpect(status().isOk())
                .andExpect(model().attributeExists("touristAttraction"))
                .andExpect(model().attributeExists("city"))
                .andExpect(model().attributeExists("tag"))
                .andExpect(view().name("add-attraction-form"));
    }

    @Test
    void addAttraction() {
    }
}