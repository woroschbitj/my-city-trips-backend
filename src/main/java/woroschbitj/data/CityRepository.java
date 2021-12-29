package woroschbitj.data;

import org.springframework.data.jpa.repository.JpaRepository;
import woroschbitj.data.model.City;

public interface CityRepository extends JpaRepository<City, Integer> {}
