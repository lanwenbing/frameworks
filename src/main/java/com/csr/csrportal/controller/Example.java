package com.csr.csrportal.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/example")
public class Example {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";
    
    @Value("${location}")
    private String location;
    
    @Value("${test.location}")
    private String testlocation;
    
    @Value("${testtest.location}")
    private String testtestlocation;

    @RequestMapping("/init")
    public String init(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "welcome";
    }

    @RequestMapping("/location")
    @ResponseBody
    public String mvpDashboard(Map<String, Object> model) {
        return location;
    }

    @RequestMapping("/mvpindex")
    @ResponseBody
    public String mvpIndex(Map<String, Object> model) {
        return testlocation;
    }

    @RequestMapping("/testtestlocation")
    @ResponseBody
    public String mvpSearchResultsCustomer(Map<String, Object> model) {
        return testtestlocation;
    }

    @RequestMapping("/mvpsearchresultsorder")
    public String mvpSearchResultsOrder(Map<String, Object> model) {
        return "mvp-search-results-order";
    }

}
