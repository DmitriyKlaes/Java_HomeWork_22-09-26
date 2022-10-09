package ru.GeekBrains.equipment;


public class Switchboard implements Work {
    private State work;

    @Override
    public boolean workCheck() {
        return this.work == State.ON;
    }

    @Override
    public void switchOn() {
        this.work = State.ON;
        System.out.println("Началась подача электричества");
    }

    @Override
    public void switchOff() {
        this.work = State.OFF;
        System.out.println("Подача электричества закончилась");
    }
}
