package com.github.hickcp.countries.repositories;

import com.github.hickcp.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
