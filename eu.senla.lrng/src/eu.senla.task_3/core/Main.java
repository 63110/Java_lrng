package eu.senla.task_3.core;

import eu.senla.task_3.Cat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("misha", 12);


        Scanner input = new Scanner(System.in);

        //<<<<<<<<<<task1>>>>>>>>>>>
        cat.ts();
//<<<<<<<<<<task2>>>>>>>>>>>

        cat.setCatName1("Mavrodui");
        cat.setCatAge1(12);
        String catName_1 = cat.getCatName1();
        int catAge_1 = cat.getCatAge1();

        for (int i = 0; i < 10; i++) {
            System.out.println("Name:" + catName_1);
            System.out.println("Age:" + catAge_1);
        }
//<<<<<<<<<<<<<<task3>>>>>>>>>>>>>


        int counter = 0;
        do {
            counter++;
            System.out.print("Name:" + cat.name + " ");
            System.out.println("age:" + cat.age);
        } while (counter < 10);

//<<<<<<<<<<<<<<task4>>>>>>>>>>>>>
        int[] array = new int[5];
        cat.setCatName1("shaman");
        cat.setCatAge1(4);
        for (int ii : array) {
            System.out.println("Name:" + cat.getCatName1() + " ");
            System.out.println("Age:" + cat.getCatAge1());
        }

//<<<<<<<<<<<<<<task2,1>>>>>>>>>>>>>
        Cat cat1 = new Cat();
        cat1.name = "Glent";
        cat1.age = 12;
        Cat cat2 = new Cat();
        cat2.name = "Glent";
        cat2.age = 6;
        System.out.println(cat1 == cat2);
        System.out.println(cat1.name.equals(cat2.name));

    }

}
