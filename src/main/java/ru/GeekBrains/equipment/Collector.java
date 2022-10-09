package ru.GeekBrains.equipment;

public class Collector {
    private State work;

    protected void start() {
        this.work = State.ON;
        System.out.println("Сборщик пыли октивирован");
    }

    protected void stop() {
        this.work = State.OFF;
        System.out.println("Сбор пыли окончен");
    }

    public boolean isWork() {
        return this.work == State.ON;
    }
}
