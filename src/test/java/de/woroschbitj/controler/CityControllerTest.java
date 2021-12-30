package de.woroschbitj.controler;

import de.woroschbitj.city.repository.CityRepository;
import de.woroschbitj.city.controler.CityController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CityControllerTest {

    @InjectMocks
    CityController sut;

    @Mock
    CityRepository cityRepository;

    @Test
    void getCity() {
        var result = sut.getCity();
        assertNotNull(result);
    }
}