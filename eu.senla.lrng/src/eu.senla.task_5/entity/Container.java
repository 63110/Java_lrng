package eu.senla.task_5.entity;

import eu.senla.task_5.enums.ContainerType;

import java.util.UUID;

public abstract class Container {

    private String uuid;
    private ContainerType type;
    private double waterDensity;
    private double height;

    public Container(ContainerType type, double waterDensity, double height) {
        this.uuid = UUID.randomUUID().toString();
        this.type = type;
        this.waterDensity = waterDensity;
        this.height = height;
    }

    public ContainerType getType() {
        return type;
    }

    public double getWaterDensity() {
        return waterDensity;
    }

    public void setWaterDensity(int waterDensity) {
        this.waterDensity = waterDensity;
    }

    public double getHeight() {
        return height;
    }

    public String getUuid() {
        return uuid;
    }
}
