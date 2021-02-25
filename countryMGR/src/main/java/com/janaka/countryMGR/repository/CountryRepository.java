package com.janaka.countryMGR.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.janaka.countryMGR.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
