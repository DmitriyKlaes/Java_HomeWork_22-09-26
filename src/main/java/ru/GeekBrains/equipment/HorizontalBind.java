package ru.GeekBrains.equipment;

public class HorizontalBind extends Bind {

    @Override
    protected void fixationStart(String message) {
        System.out.printf("Фиксация по оси X %s прошла успешно%n", message);
    }

    @Override
    protected void fixationStop(String message) {
        System.out.printf("Фиксация по оси X %s отключена%n", message);
    }
}
