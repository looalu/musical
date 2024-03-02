package com.example.musical;

public class Accessory extends Product {
    private String category;
    private String color;
    public Accessory() {}

    public Accessory(String name, double price, String description, String imageUrl, String category, String color) {
        super(name, price, description, imageUrl);
        this.category = category;
        this.color = color;
    }
    @Override
    public String getProductType() {
        return "Accessory";
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Accessory{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                ", imageUrl='" + getImageUrl() + '\'' +
                ", category='" + category + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
