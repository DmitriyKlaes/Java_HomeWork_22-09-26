package ru.GeekBrains.equipment.doubleHeadSaw;

import ru.GeekBrains.equipment.State;

public class SawRightHead extends SawHead {
    private State work;

    @Override
    protected void cutting() {
        System.out.println("Распил справа произведен");
    }

    @Override
    protected String setMessageForBind() {
        return "с правой стороны";
    }

    @Override
    public boolean workCheck() {
        return this.work == State.ON;
    }

    @Override
    public void switchOn() {
        this.work = State.ON;
        System.out.println("Правая голова включена");
    }

    @Override
    public void switchOff() {
        this.work = State.OFF;
        System.out.println("Правая голова выключена");
    }
}
