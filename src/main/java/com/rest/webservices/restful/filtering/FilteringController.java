package com.rest.webservices.restful.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    //field-1 , field-2
    @GetMapping("/filtering")
    public SomeBean retrieveSomeBean(){
        SomeBean someBean = new SomeBean("value1","value2","value3");
        return someBean;
    }

    //field-2 , field-3
    @GetMapping("/filtering-list")
    public List<SomeBean> retrieveSomeBeanList(){
        return  Arrays.asList(new SomeBean("value1","value2","value3"),new SomeBean("value11","value22","value33"));
    }
}
