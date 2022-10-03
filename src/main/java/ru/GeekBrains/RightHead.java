package ru.GeekBrains;

public class RightHead extends Head {
    private State work;

    protected void start () {
        this.work = State.ON;
        System.out.println("Правая голова включена");
    }

    protected void stop () {
        this.work = State.OFF;
        System.out.println("Правая голова выключена");
    }

    @Override
    protected void cutting() {
        System.out.println("Пилю справа");
    }

    @Override
    protected boolean isWork() {
        return this.work == State.ON;
    }

    @Override
    public void workCheck() {
        if (this.work == State.ON) {
            System.out.println("Правая голова работает");
        } else {
            System.out.println("Правая голова отключена");
        }
    }
}
