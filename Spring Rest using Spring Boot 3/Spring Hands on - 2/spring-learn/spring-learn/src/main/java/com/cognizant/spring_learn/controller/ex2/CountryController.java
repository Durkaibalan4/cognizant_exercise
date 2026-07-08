package com.cognizant.spring_learn.controller.ex2;

import com.cognizant.spring_learn.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/country")
    public Country getCountryIndia() {

        Country country = new Country();

        country.setCode("IN");
        country.setName("India");

        return country;
    }

}