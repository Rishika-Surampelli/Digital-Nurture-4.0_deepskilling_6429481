package com.cognizant.spring_learn.controller;

import java.util.ArrayList;
import java.util.List;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.service.CountryService;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("START");
        Country country = (Country) context.getBean("in", Country.class);
        LOGGER.info("END");
        return country;
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        LOGGER.info("START");
        List<Country> list = context.getBean("countryList", ArrayList.class);
        LOGGER.info("END");
        return list;
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) throws CountryNotFoundException {
        LOGGER.info("START");
        CountryService service = new CountryService();
        Country country = service.getCountry(code);
        LOGGER.info("END");
        return country;
    }
}
