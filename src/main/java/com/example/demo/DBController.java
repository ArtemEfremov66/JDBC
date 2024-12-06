package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class DBController {
    private final DBRepository dbRepository;
    public DBController(DBRepository dbRepository) {
        this.dbRepository = dbRepository;
    }
}
