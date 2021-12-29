package woroschbitj.controler;

import org.springframework.web.bind.annotation.*;
import woroschbitj.model.City;

import static woroschbitj.controler.CityController.BASE_PATH;

@RestController
@RequestMapping(BASE_PATH)
public class CityController {

    public final static String BASE_PATH = "api/v1/city";

    @GetMapping(produces = "application/json")
    public @ResponseBody City getCity() {
        return City.builder().name("Berlin").country("DE").build();
    }
}
