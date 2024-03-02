package com.example.musical;

public class Instrument extends Product {
    private String type;
    private String brand;
    private String material;
    public Instrument() {}

    public Instrument(String name, double price, String description, String imageUrl, String type, String brand, String material) {
        super(name, price, description, imageUrl);
        this.type = type;
        this.brand = brand;
        this.material = material;
    }
    @Override
    public String getProductType() {
        return "Instrument";
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                ", imageUrl='" + getImageUrl() + '\'' +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
