package org.example.Car.Settings;

import java.util.PrimitiveIterator;

public class MainCarSettings {
    private String nameCar;
    private int yearCar;


    public String getNameCar() {
        return nameCar;
    }

    public int getYearCar() {
        return yearCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public void setYearCar(int yearCar) {
        this.yearCar = yearCar;
    }


    public MainCarSettings(String nameCar, int yearCar) {
        this.nameCar = nameCar;
        this.yearCar = yearCar;
    }


    @Override
    public String toString() {
        return "MainCarSettings{" +
                "nameCar='" + nameCar + '\'' +
                ", yearCar=" + yearCar +
                '}';
    }
}
