package com.cognizant.spring_security_jwt.service;

import com.cognizant.spring_security_jwt.model.Countries;
import com.cognizant.spring_security_jwt.model.Country;
import com.cognizant.spring_security_jwt.util.CountryUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    public List<Country> getAllCountries() {

        Countries countries = CountryUtil.loadCountries();

        return countries.getCountryList();
    }

    public Country getCountry(String code) {

        Countries countries = CountryUtil.loadCountries();

        for (Country country : countries.getCountryList()) {

            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }

        }

        return null;
    }
}