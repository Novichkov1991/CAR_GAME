package org.example.Car;

import org.example.Car.Settings.*;
import org.example.Main;

public class CreatorCar {
    public YourCar creatorFormula(){
        MainCarSettings mainCarSettings = new MainCarSettings("Formula", 1);
        Engine engine = new Engine("SUPER MOTOR", 999, 33, 999);
        Transmission transmission = new Transmission("SUPER TRANS", 500, 33, 999);
        Kolesa kolesa = new Kolesa("PIRELLI", 24, 99, 33, 999);
        Kuzov kuzov = new Kuzov("SUPERCAR", 999, 33, 999);
        YourCar yourCar = new YourCar(mainCarSettings, engine, transmission, kolesa, kuzov);
        return yourCar;
    }
    public YourCar creatorToyota(){
        MainCarSettings mainCarSettings = new MainCarSettings("Toyota", 5);
        Engine engine = new Engine("Toyota MOTOR", 350, 15,500);
        Transmission transmission = new Transmission("Aisin", 560, 15, 500);
        Kolesa kolesa = new Kolesa("GoodYear", 20, 30, 15,500);
        Kuzov kuzov = new Kuzov("HatchBack", 1300, 15, 500);
        YourCar yourCar = new YourCar(mainCarSettings, engine, transmission, kolesa, kuzov);
        return yourCar;
    }
    public YourCar creatorBMW(){
        MainCarSettings mainCarSettings = new MainCarSettings("BMW", 2);
        Engine engine = new Engine("BMW MOTOR", 420, 25, 700);
        Transmission transmission = new Transmission("Zahnrad Fabrik", 400, 25,700);
        Kolesa kolesa = new Kolesa("GoodYear", 22, 60, 25,700);
        Kuzov kuzov = new Kuzov("Jeep", 1900, 25, 700);
        YourCar yourCar = new YourCar(mainCarSettings, engine, transmission, kolesa, kuzov);
        return yourCar;
    }
    public YourCar creatorLadaPrioraChernaya(){
        MainCarSettings mainCarSettings = new MainCarSettings("LADA PRIORA CHERNAYA", 10);
        Engine engine = new Engine("V GARAJE PEREBRAL MOTOR", 999999999, 33, 9999);
        Transmission transmission = new Transmission("KUPIL 5 SHTUK PRO ZAPAS", 999999, 33, 9999);
        Kolesa kolesa = new Kolesa("KAMA-PULYA", 27, 9999999, 33, 9999);
        Kuzov kuzov = new Kuzov("LADA SIDAN", 800, 33, 9999);
        YourCar yourCar = new YourCar(mainCarSettings, engine, transmission, kolesa, kuzov);
        return yourCar;
    }
    public YourCar creatorGazel(){
        MainCarSettings mainCarSettings = new MainCarSettings("Gazel", 25);
        Engine engine = new Engine("ELE JIV NA GAZU", 5, 40, 80);
        Transmission transmission = new Transmission("ESHE CHUT CHUT", 20003133, 40,80);
        Kolesa kolesa = new Kolesa("ZAPLATKI IZ RAZNIH, NE IZVESTNO KAK NAZIVAETSYA", 14, 3, 40, 80);
        Kuzov kuzov = new Kuzov("GRUZOVOY GNILOY", 1234, 40,80);
        YourCar yourCar = new YourCar(mainCarSettings, engine, transmission, kolesa, kuzov);

        return yourCar;
    }



}

