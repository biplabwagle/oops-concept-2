package main;

import oopsconceptsbasics.BottleJuice;

import java.net.StandardSocketOptions;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BottleJuice orangeJuice = new BottleJuice();
        orangeJuice.setName("Baja Juice");
        orangeJuice.setCalories(100);
        orangeJuice.setDisclaimers("Refrigerate after opening, check expiryDate before consuming");
        orangeJuice.setFat(1);
        orangeJuice.setDietaryFibre(1);
        orangeJuice.setExpiryDate(LocalDate.now().plusMonths(24));
        orangeJuice.setHasAntiOxidants(true);
        orangeJuice.setManufactureDate(LocalDate.now());
        System.out.println(orangeJuice.printInfo());
    }


}