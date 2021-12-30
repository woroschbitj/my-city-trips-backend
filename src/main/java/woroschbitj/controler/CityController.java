package woroschbitj.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import woroschbitj.data.CityRepository;
import woroschbitj.data.model.City;

import java.util.List;

import static woroschbitj.controler.CityController.BASE_PATH;

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
