package com.example.demo;

public class People {
    private String name;
    private String product_name;

    public People(String name, String product_name) {
        this.name = name;
        this.product_name = product_name;
    }

    public String getName() {
        return name;
    }

    public String getProduct_name() {
        return product_name;
    }
}
