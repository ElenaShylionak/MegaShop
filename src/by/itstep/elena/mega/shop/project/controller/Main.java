package by.itstep.elena.mega.shop.project.controller;

import by.itstep.elena.mega.shop.project.data.Milk;
import by.itstep.elena.mega.shop.project.data.Orange;

public class Main {
    public static void main(String[] args) {

        Orange orange = new Orange(200, 3000, 4.5);
        System.out.println(orange);

        Milk milk= new Milk(1000, 3.5, 2.5);
        System.out.println(milk);
    }
}