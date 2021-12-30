package de.woroschbitj.city.controler;

import de.woroschbitj.city.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import de.woroschbitj.city.data.City;

import java.util.List;

import static de.woroschbitj.city.controler.CityController.BASE_PATH;

@RestController
@RequestMapping(BASE_PATH)
public class CityController {

    @Autowired
    CityRepository cityRepository;

    public final static String BASE_PATH = "api/v1/city";

    @GetMapping(produces = "application/json")
    public @ResponseBody
    List<City> getCity() {
        return cityRepository.findAll();
    }
}
