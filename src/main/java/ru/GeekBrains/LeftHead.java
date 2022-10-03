package ru.GeekBrains;

public class LeftHead extends Head {

    private State work;

    protected void start () {
        this.work = State.ON;
        System.out.println("Левая голова включена");
    }

    protected void stop () {
        this.work = State.OFF;
        System.out.println("Левая голова выключена");
    }

    @Override
    protected void cutting() {
        System.out.println("Пилю слева");
    }
    @Override
    protected boolean isWork() {
        return this.work == State.ON;
    }

    @Override
    public void workCheck() {
        if (this.work == State.ON) {
            System.out.println("Левая голова работает");
        } else {
            System.out.println("Левая голова отключена");
        }
    }
}
