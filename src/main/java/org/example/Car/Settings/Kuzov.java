package org.example.Car.Settings;

import java.util.PrimitiveIterator;

public class Kuzov {
    private String nameKuzov;
    private int weightKuzov;


    public String getNameKuzov() {
        return nameKuzov;
    }

    public int getWeightKuzov() {
        return weightKuzov;
    }

    public void setNameKuzov(String nameKuzov) {
        this.nameKuzov = nameKuzov;
    }

    public void setWeightKuzov(int weightKuzov) {
        this.weightKuzov = weightKuzov;
    }


    public Kuzov(String nameKuzov, int weightKuzov) {
        this.nameKuzov = nameKuzov;
        this.weightKuzov = weightKuzov;
    }


    @Override
    public String toString() {
        return "Kuzov{" +
                "nameKuzov='" + nameKuzov + '\'' +
                ", weightKuzov=" + weightKuzov +
                '}';
    }
}
