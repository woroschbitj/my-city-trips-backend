package de.woroschbitj.city.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import de.woroschbitj.city.data.City;

public interface CityRepository extends JpaRepository<City, Integer> {}
