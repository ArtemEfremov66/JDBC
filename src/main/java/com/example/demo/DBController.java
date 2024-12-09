package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DBController {
    private final DBRepository dbRepository;
    @Autowired
    public DBController(DBRepository dbRepository) {
        this.dbRepository = dbRepository;
    }

    @GetMapping("/products/fetch-product")
    public List<People> getProduct(@RequestParam("name") String name) {
    return dbRepository.getProductName(name);
    }

    @GetMapping("/test")
    public String test() {
        return "Ok";
    }
}
