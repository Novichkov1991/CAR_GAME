package org.example;

import org.example.Car.*;
import org.example.Car.Settings.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        MainCarSettings mainCarSettings = new MainCarSettings("main",50);
        Engine engine = new Engine("eng", 55);
        Transmission transmission = new Transmission("trans", 22);
        Kolesa kolesa = new Kolesa("kol", 21, 205);
        Kuzov kuzov = new Kuzov("kuz", 44);
        YourCar yourCar = new YourCar(mainCarSettings, engine, transmission, kolesa, kuzov);

        System.out.println(yourCar);

    }
}