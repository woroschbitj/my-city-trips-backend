package woroschbitj.controler;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import woroschbitj.data.CityRepository;

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