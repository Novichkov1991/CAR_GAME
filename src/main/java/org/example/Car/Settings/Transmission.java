package org.example.Car.Settings;

public class Transmission {
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


    public Transmission(String nameTransmission, int useTransmission) {
        this.nameTransmission = nameTransmission;
        this.useTransmission = useTransmission;
    }


    @Override
    public String toString() {
        return "Transmission{" +
                "nameTransmission='" + nameTransmission + '\'' +
                ", useTransmission=" + useTransmission +
                '}';
    }
}
