package ru.GeekBrains.equipment;

public class VerticalBind extends Bind {

    @Override
    protected void fixationStart(String message) {
        System.out.printf("Фиксация по оси Y %s прошла успешно%n", message);
    }

    @Override
    protected void fixationStop(String message) {
        System.out.printf("Фиксация по оси Y %s отключена%n", message);
    }
}
