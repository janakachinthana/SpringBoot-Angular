package com.janaka.countryMGR.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.janaka.countryMGR.model.Country;
import com.janaka.countryMGR.repository.CountryRepository;

@RestController
@RequestMapping("/api/v1")
public class CountryController {

	@Autowired
	private CountryRepository countryRepository;
	
	//get all countries
	
	@GetMapping("/countries")
	public List<Country>getAllCountries(){
		
		return countryRepository.findAll();
		
	}
}
