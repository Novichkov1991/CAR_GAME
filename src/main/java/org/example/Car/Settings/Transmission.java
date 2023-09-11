package org.example.Car.Settings;

import org.example.Car.Settings.Parts.Parts;

public class Transmission extends Parts {
    private String nameTransmission;
    private int useTransmission;


    public String getNameTransmission() {
        return nameTransmission;
    }

    public int getUseTransmission() {
        return useTransmission;
    }

    public void setNameTransmission(String nameTransmission) {
        this.nameTransmission = nameTransmission;
    }

    public void setUseTransmission(int useTransmission) {
        this.useTransmission = useTransmission;
    }



    public Transmission(String nameTransmission, int useTransmission, int iznos, int mainPower) {
        super(iznos, mainPower);
        this.nameTransmission = nameTransmission;
        this.useTransmission = useTransmission;
    }





    @Override
    public String toString() {
        return "Transmission{" +
                "nameTransmission='" + nameTransmission + '\'' +
                ", useTransmission=" + useTransmission +
                ", iznos=" + iznos +
                ", mainPower=" + mainPower +
                '}';
    }
}
