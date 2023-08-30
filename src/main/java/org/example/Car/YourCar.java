package org.example.Car;

import org.example.Car.Settings.*;

public class YourCar {
    private MainCarSettings mainCarSettings;
    private Engine engine;
    private Transmission transmission;
    private Kolesa kolesa;
    private Kuzov kuzov;


    public MainCarSettings getMainCarSettings() {
        return mainCarSettings;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Kolesa getKolesa() {
        return kolesa;
    }

    public Kuzov getKuzov() {
        return kuzov;
    }

    public void setMainCarSettings(MainCarSettings mainCarSettings) {
        this.mainCarSettings = mainCarSettings;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setKolesa(Kolesa kolesa) {
        this.kolesa = kolesa;
    }

    public void setKuzov(Kuzov kuzov) {
        this.kuzov = kuzov;
    }


    public YourCar(MainCarSettings mainCarSettings, Engine engine, Transmission transmission, Kolesa kolesa, Kuzov kuzov) {
        this.mainCarSettings = mainCarSettings;
        this.engine = engine;
        this.transmission = transmission;
        this.kolesa = kolesa;
        this.kuzov = kuzov;
    }


    @Override
    public String toString() {
        return "YourCar{" +
                "mainCarSettings=" + mainCarSettings +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", kolesa=" + kolesa +
                ", kuzov=" + kuzov +
                '}';
    }
}
