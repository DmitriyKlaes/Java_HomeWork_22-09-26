package ru.GeekBrains;

public class Switchboard {
    private Boolean work;

    public void start () {
        this.work = true;
        System.out.println("Началась подача электричества");
    }

    public void stop () {
        this.work = false;
        System.out.println("Подача электричества закончилась");
    }

    public Boolean getWork() {
        return work;
    }


}
