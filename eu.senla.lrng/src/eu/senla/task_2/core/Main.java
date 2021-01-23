package eu.senla.task_2.core;

import eu.senla.task_2.Rainbow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rainbow rainbow = new Rainbow();
        Scanner input = new Scanner(System.in);
        System.out.println("Choose number or color rainbow 1-7");
        int colorNumber = input.nextInt();
        rainbow.getColor(colorNumber);
    }
}