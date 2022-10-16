package ru.GeekBrains.equipment;

public interface ReadyButtons {

    default boolean leftReadyButton(Head obj) {
        return obj.workCheck();
    }

    default boolean rightReadyButton(Head obj) {
        return obj.workCheck();
    }
}
