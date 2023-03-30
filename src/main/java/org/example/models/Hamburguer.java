package org.example.models;

public class Hamburguer {

    private String name;
    private double price;
    private String ingredients;
    private String imageURL;

    public Hamburguer(String name, double price, String ingredients, String imageURL) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getImageURL() {
        return imageURL;
    }
}
