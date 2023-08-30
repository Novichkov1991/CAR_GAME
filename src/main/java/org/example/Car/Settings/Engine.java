package org.example.Car.Settings;

public class Engine {
    private String nameEngine;
    private int powerEngine;


    public String getNameEngine() {
        return nameEngine;
    }

    public int getPowerEngine() {
        return powerEngine;
    }

    public void setNameEngine(String nameEngine) {
        this.nameEngine = nameEngine;
    }

    public void setPowerEngine(int powerEngine) {
        this.powerEngine = powerEngine;
    }


    public Engine(String nameEngine, int powerEngine) {
        this.nameEngine = nameEngine;
        this.powerEngine = powerEngine;
    }


    @Override
    public String toString() {
        return "Engine{" +
                "nameEngine='" + nameEngine + '\'' +
                ", powerEngine=" + powerEngine +
                '}';
    }
}
