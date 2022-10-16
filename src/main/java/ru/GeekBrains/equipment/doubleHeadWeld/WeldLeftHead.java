package ru.GeekBrains.equipment.doubleHeadWeld;

import ru.GeekBrains.equipment.State;

public class WeldLeftHead extends WeldHead {
    private State work;

    @Override
    protected void welding() {
        System.out.println("Сварка слева произведена");
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
