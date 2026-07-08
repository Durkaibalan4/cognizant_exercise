package com.cognizant.spring_learn.service.ex4;

import com.cognizant.spring_learn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CountryService {

    @SuppressWarnings("unchecked")
    public Country getCountry(String code) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("countries.xml");

        List<Country> countryList =
                (List<Country>) context.getBean("countryList");

        for (Country country : countryList) {

            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }

        }

        return null;
    }

}