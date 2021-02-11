package eu.senla.task_5.entity;

import java.util.List;

public class Waterfront {

    private List<Ship> ships;

    public Waterfront(List<Ship> ships) {
        this.ships = ships;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }
}
