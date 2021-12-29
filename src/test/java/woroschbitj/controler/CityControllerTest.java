package woroschbitj.controler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityControllerTest {

    CityController sut;

    @BeforeEach
    public void setSut(){
        sut = new CityController();
    }

    @Test
    void getCity() {
        var result = sut.getCity();
        assertNotNull(result);
    }
}