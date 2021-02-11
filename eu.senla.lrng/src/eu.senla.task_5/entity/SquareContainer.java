package eu.senla.task_5.entity;

import eu.senla.task_5.enums.ContainerType;
import eu.senla.task_5.service.WeightCalculator;

public class SquareContainer extends Container implements WeightCalculator {

    private int diagonal;

    public SquareContainer(ContainerType type, double waterDensity, double height, int diagonal) {
        super(type, waterDensity, height);
        this.diagonal = diagonal;
    }

    @Override
    public double getWeight() {
        double volume = (Math.pow(diagonal, 2) / 2) * getHeight();
        return volume * getWaterDensity();
    }
}
