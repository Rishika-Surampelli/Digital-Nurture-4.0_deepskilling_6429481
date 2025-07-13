package com.cognizant.spring_learn.service;

import java.util.ArrayList;
import java.util.List;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryService {
    public Country getCountry(String code) throws CountryNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = context.getBean("countryList", ArrayList.class);
        return countries.stream()
            .filter(c -> c.getCode().equalsIgnoreCase(code))
            .findAny()
            .orElseThrow(CountryNotFoundException::new);
    }
}
