package ru.GeekBrains.equipment.doubleHeadWeld;

import ru.GeekBrains.equipment.State;

public class WeldRightHead extends WeldHead {
    private State work;

    @Override
    protected void welding() {
        System.out.println("Сварка справа произведена");
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
