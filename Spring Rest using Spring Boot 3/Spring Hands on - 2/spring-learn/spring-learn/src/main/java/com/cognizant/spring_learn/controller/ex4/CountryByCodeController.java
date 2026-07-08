package com.cognizant.spring_learn.controller.ex4;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.ex4.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryByCodeController {

    private CountryService service = new CountryService();

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {

        return service.getCountry(code);

    }
}