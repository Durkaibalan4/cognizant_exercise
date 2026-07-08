package com.cognizant.spring_security_jwt.util;

import com.cognizant.spring_security_jwt.model.Countries;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

import java.io.InputStream;

public class CountryUtil {

    public static Countries loadCountries() {

        try {

            JAXBContext context = JAXBContext.newInstance(Countries.class);

            Unmarshaller unmarshaller = context.createUnmarshaller();

            InputStream inputStream =
                    CountryUtil.class.getClassLoader()
                            .getResourceAsStream("countries.xml");

            return (Countries) unmarshaller.unmarshal(inputStream);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}