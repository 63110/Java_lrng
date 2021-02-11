package eu.senla.task_5.entity;

import eu.senla.task_5.enums.ContainerType;
import eu.senla.task_5.service.WeightCalculator;

public class ConeContainer extends Container implements WeightCalculator {

    private double diameter;

    public ConeContainer(ContainerType type, double waterDensity, double height, double diameter) {
        super(type, waterDensity, height);
        this.diameter = diameter;
    }

    @Override
    public double getWeight() {
        double volume = (1.0 / 3) * Math.PI * Math.pow((diameter / 2), 2) * getHeight();
        return volume * getWaterDensity();
    }
}
