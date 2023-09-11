package org.example.Car.Settings;

import org.example.Car.Settings.Parts.Parts;

public class Kolesa extends Parts {
    private String nameKolesa;
    private int sizeKolesa;
    private int frictionKolesa;


    public String getNameKolesa() {
        return nameKolesa;
    }

    public int getSizeKolesa() {
        return sizeKolesa;
    }

    public int getFrictionKolesa() {
        return frictionKolesa;
    }

    public void setNameKolesa(String nameKolesa) {
        this.nameKolesa = nameKolesa;
    }

    public void setSizeKolesa(int sizeKolesa) {
        this.sizeKolesa = sizeKolesa;
    }

    public void setFrictionKolesa(int frictionKolesa) {
        this.frictionKolesa = frictionKolesa;
    }


    public Kolesa(String nameKolesa, int sizeKolesa, int frictionKolesa, int iznos, int mainPower) {
        super(iznos, mainPower);
        this.nameKolesa = nameKolesa;
        this.sizeKolesa = sizeKolesa;
        this.frictionKolesa = frictionKolesa;
    }




    @Override
    public String toString() {
        return "Kolesa{" +
                "nameKolesa='" + nameKolesa + '\'' +
                ", sizeKolesa=" + sizeKolesa +
                ", frictionKolesa=" + frictionKolesa +
                ", iznos=" + iznos +
                ", mainPower=" + mainPower +
                '}';
    }
}
