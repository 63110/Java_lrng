package eu.senla.task_5.entity;

import eu.senla.task_5.enums.ContainerType;

import java.util.*;

public class Ship {

    private static final EnumMap<ContainerType, Integer> DECK_MAX_CAPACITY_MAP = new EnumMap<>(ContainerType.class);

    static {
        DECK_MAX_CAPACITY_MAP.put(ContainerType.BIG, 2);
        DECK_MAX_CAPACITY_MAP.put(ContainerType.SMALL, 4);
    }

    private int numberOfDeck;

    private List<Container> containers = new ArrayList<>();

    public Ship(int numberOfDeck) {
        this.numberOfDeck = numberOfDeck;
    }

    public boolean addContainer(Container container) {
        Integer maxAmount = DECK_MAX_CAPACITY_MAP.get(container.getType());
        int containerCountByType = getContainerCountByType(container.getType());
        int otherTypesContainerCount = containers.size() - containerCountByType;
        if (containerCountByType < maxAmount * numberOfDeck && otherTypesContainerCount == 0) {
            containers.add(container);
            return true;
        }
        return false;
    }

    public boolean removeContainer(String containerUuid) {
        return containers.removeIf(container -> container.getUuid().equals(containerUuid));
    }

    public Container getContainerByUuid(String uuid) {
        for (Container container : containers) {
            if (container.getUuid().equals(uuid)) {
                return container;
            }
        }
        return null;
    }

    private int getContainerCountByType(ContainerType type) {
        return (int) containers.stream()
                .filter(container -> container.getType() == type)
                .count();
    }
}
