package org.example;

import org.example.Car.*;
import org.example.Car.Settings.*;

import java.util.Scanner;

public class Main {

    public static String[] nameCars = new String[]{"Formula", "Toyota", "BMW", "LADA PRIORA CHERNAYA", "Gazel"};

    public static void main(String[] args) {
        System.out.println("Hello CHEL !" + "\n");

        CreatorCar creatorCar = new CreatorCar();


        System.out.println("Выберайте тачки : \n1 - Formula" + "\n" + "2 - Toyota" + "\n" + "3 - BMW" + "\n" + "4 - LADA PRIORA CHERNAYA" + "\n" + "5 - Gazel");
        Scanner sc = new Scanner(System.in);
        int chooseFirstCar = sc.nextInt();
        int chooseSecondCar = sc.nextInt();
        YourCar yourFirstCar;
        YourCar yourSecondCar;




        if (chooseFirstCar == 1) {
            yourFirstCar = creatorCar.creatorFormula();
            System.out.println("\n   Тачка первого игрока:");
            System.out.println(creatorCar.creatorFormula());
            System.out.println(yourFirstCar.getScore());

        } else if (chooseFirstCar == 2) {
            yourFirstCar = creatorCar.creatorToyota();
            System.out.println("\n   Тачка первого игрока:");
            System.out.println(creatorCar.creatorToyota());
            System.out.println(yourFirstCar.getScore());

        } else if (chooseFirstCar == 3) {
            yourFirstCar = creatorCar.creatorBMW();
            System.out.println("\n   Тачка первого игрока:");
            System.out.println(creatorCar.creatorBMW());
            System.out.println(yourFirstCar.getScore());

        } else if (chooseFirstCar == 4) {
            yourFirstCar = creatorCar.creatorLadaPrioraChernaya();
            System.out.println("\n   Тачка первого игрока:");
            System.out.println(creatorCar.creatorLadaPrioraChernaya());
            System.out.println(yourFirstCar.getScore());

        } else if (chooseFirstCar == 5) {
            yourFirstCar = creatorCar.creatorGazel();
            System.out.println("\n   Тачка первого игрока:");
            System.out.println(creatorCar.creatorGazel());
            System.out.println(yourFirstCar.getScore());

        } else {
            yourFirstCar = null;
            System.out.println("\n   Ну ты чего ? Перезапусти и выбери машину то !");
        }


        if (chooseSecondCar == 1) {
            yourSecondCar = creatorCar.creatorFormula();
            System.out.println("\n   Тачка второго игрока:");
            System.out.println(creatorCar.creatorFormula());
            System.out.println(yourSecondCar.getScore());

        } else if (chooseSecondCar == 2) {
            yourSecondCar = creatorCar.creatorToyota();
            System.out.println("\n   Тачка второго игрока:");
            System.out.println(creatorCar.creatorToyota());
            System.out.println(yourSecondCar.getScore());

        } else if (chooseSecondCar == 3) {
            yourSecondCar = creatorCar.creatorBMW();
            System.out.println("\n   Тачка второго игрока:");
            System.out.println(creatorCar.creatorBMW());
            System.out.println(yourSecondCar.getScore());

        } else if (chooseSecondCar == 4) {
            yourSecondCar = creatorCar.creatorLadaPrioraChernaya();
            System.out.println("\n   Тачка второго игрока:");
            System.out.println(creatorCar.creatorLadaPrioraChernaya());
            System.out.println(yourSecondCar.getScore());

        } else if (chooseSecondCar == 5) {
            yourSecondCar = creatorCar.creatorGazel();
            System.out.println("\n   Тачка второго игрока:");
            System.out.println(creatorCar.creatorGazel());
            System.out.println(yourSecondCar.getScore());

        } else {
            yourSecondCar = null;
            System.out.println("\n   Ну ты чего ? Перезапусти и выбери машину то !");
        }



        if (yourFirstCar != null && yourSecondCar != null) {
            int x = yourFirstCar.getScore();
            int y = yourSecondCar.getScore();
            if (x > y) {
                System.out.println("\n Победил Первый (1) gamer");
            } else if (x < y) {
                System.out.println("\n Победил Второй (2) gamer");
            } else {
                System.out.println("\n Вы че тупые на одинаковых тачках гоняться ?");
            }
        }
    }
}

