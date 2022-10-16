package ru.GeekBrains.equipment;

public abstract class Base<T extends Head> {

    protected abstract T getHeadLeft();
    protected abstract T getHeadRight();
}
