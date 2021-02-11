package eu.senla.task_5;


import eu.senla.task_5.entity.ConeContainer;
import eu.senla.task_5.entity.Ship;
import eu.senla.task_5.entity.Waterfront;

import java.util.ArrayList;
import java.util.List;

import static eu.senla.task_5.enums.ContainerType.BIG;

public class Main {

    public static void main(String[] args) {
        List<Ship> ships = new ArrayList<>();
        Ship ship = new Ship(1);
        ConeContainer container = new ConeContainer(BIG, 1000, 100, 20);
        ship.addContainer(container);
        ships.add(ship);
        Waterfront waterfront = new Waterfront(ships);
        System.out.println(container.getWeight());
    }
}
