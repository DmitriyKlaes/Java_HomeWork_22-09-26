package ru.GeekBrains.equipment;

public class ViewStat {
    public void resultWork() {
        System.out.printf("Всего было потрачено %d хлыстов профиля%n", CollSticks.getCountWhip());
        System.out.println("Остатки профиля:");
        System.out.println(CollSticks.getWhipCollDeparture());
    }
}
