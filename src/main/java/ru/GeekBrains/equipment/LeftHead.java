package ru.GeekBrains.equipment;

public class LeftHead extends Head {
    private State work;

    @Override
    protected void cutting() {
        System.out.println("Распил слева произведен");
    }

    @Override
    protected String setMessageForBind() {
        return "с левой стороны";
    }

    @Override
    public boolean workCheck() {
        return this.work == State.ON;
    }

    @Override
    public void switchOn() {
        this.work = State.ON;
        System.out.println("Левая голова включена");
    }

    @Override
    public void switchOff() {
        this.work = State.OFF;
        System.out.println("Левая голова выключена");
    }
}
