package com.zhllllll.spring.bean;

public class Car {
    private int carId;
    private String name;
    private String price;

    public Car() {
    }

    public Car(int carId, String name, String price) {
        this.carId = carId;
        this.name = name;
        this.price = price;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getCarId() {
        return carId;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
