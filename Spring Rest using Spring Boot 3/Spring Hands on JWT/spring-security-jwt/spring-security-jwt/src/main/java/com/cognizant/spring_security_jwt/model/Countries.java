package com.cognizant.spring_security_jwt.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "countries")
@XmlAccessorType(XmlAccessType.FIELD)
public class Countries {

    @XmlElement(name = "country")
    private List<Country> countryList;

    public Countries() {
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }
}
