package org.example.Car.Settings;

import org.example.Car.Settings.Parts.Parts;

public class Engine extends Parts {
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


    public Engine(String nameEngine, int powerEngine, int iznos, int mainPower) {
        super(iznos, mainPower);
        this.nameEngine = nameEngine;
        this.powerEngine = powerEngine;
    }




    @Override
    public String toString() {
        return "Engine{" +
                "nameEngine='" + nameEngine + '\'' +
                ", powerEngine=" + powerEngine +
                ", iznos=" + iznos +
                ", mainPower=" + mainPower +
                '}';
    }
}
