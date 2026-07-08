package com.cognizant.spring_learn.controller.ex3;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.util.ex3.CountryUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountriesController {

    @GetMapping("/countries")
    public List<Country> getAllCountries() {

        return CountryUtil.getCountryList();

    }

}