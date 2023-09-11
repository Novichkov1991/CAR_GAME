package org.example.Car;

import org.example.Car.Settings.*;
import org.example.Car.Settings.Parts.Parts;

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







    public int getScore(){
//        int score = getMainCarSettings().getYearCar() + getEngine().getPowerEngine() - getTransmission().getUseTransmission() + getKolesa().getSizeKolesa();
        int score = ( ( getEngine().getMainPower() * getEngine().getPowerEngine() - getEngine().getIznos() ) + ( getTransmission().getMainPower() / getTransmission().getUseTransmission() - getTransmission().getIznos() ) + ( getKolesa().getMainPower() * getKolesa().getSizeKolesa() / getKolesa().getIznos() ) + ( getKuzov().getMainPower() / getKuzov().getIznos() ) )  / getKuzov().getWeightKuzov();
        return score;
    }


    public YourCar(MainCarSettings mainCarSettings, Engine engine, Transmission transmission, Kolesa kolesa, Kuzov kuzov) {
        this.mainCarSettings = mainCarSettings;
        this.engine = engine;
        this.transmission = transmission;
        this.kolesa = kolesa;
        this.kuzov = kuzov;
    }


//    public YourCar() {
//        this.mainCarSettings = null;
//        this.engine = null;
//        this.transmission = null;
//        this.kolesa = null;
//        this.kuzov = null;
//    }


    @Override
    public String toString() {
        return  "Основное " + mainCarSettings + ",\n" +
                "Мотор " + engine + ",\n" +
                "Трансмиссия " + transmission + ",\n" +
                "Кодеса " + kolesa + ",\n" +
                "Кузов " + kuzov + ".\n";
    }

}
