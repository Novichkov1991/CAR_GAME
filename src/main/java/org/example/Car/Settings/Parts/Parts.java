package org.example.Car.Settings.Parts;

public abstract class Parts {
    protected int iznos;
    protected int mainPower;



    public Parts(int iznos, int mainPower) {

        this.iznos = iznos;
        this.mainPower = mainPower;
    }







    public int getIznos() {
        return iznos;
    }

    public void setIznos(int iznos) {
        this.iznos = iznos;
    }

    public int getMainPower() {
        return mainPower;
    }

    public void setMainPower(int mainPower) {
        this.mainPower = mainPower;
    }

    @Override
    public String toString() {
        return "Parts{" +
                "iznos=" + iznos +
                ", mainPower=" + mainPower +
                '}';
    }
}
