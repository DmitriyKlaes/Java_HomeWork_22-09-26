package ru.GeekBrains;


public class Switchboard {
    private State work;

    protected void start () {
        this.work = State.ON;
        System.out.println("Началась подача электричества");
    }

    protected void stop () {
        this.work = State.OFF;
        System.out.println("Подача электричества закончилась");
    }

    public boolean isWork() {
        return this.work == State.ON;
    }


}
