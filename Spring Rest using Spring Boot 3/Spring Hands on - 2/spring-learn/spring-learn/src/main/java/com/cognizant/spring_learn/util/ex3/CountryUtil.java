package com.cognizant.spring_learn.util.ex3;

import com.cognizant.spring_learn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CountryUtil {

    @SuppressWarnings("unchecked")
    public static List<Country> getCountryList() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("countries.xml");

        return (List<Country>) context.getBean("countryList");

    }

}