package ru.test;


public class Product {
    private String name;
    private String attribute;
    private String isProduct;

    public Product(String name, String attribute, String isProduct) {
        this.name = name;
        this.attribute = attribute;
        this.isProduct = isProduct;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getIsProduct() {
        return isProduct;
    }

    public void setIsProduct(String isProduct) {
        this.isProduct = isProduct;
    }
}
