package ru.GeekBrains.equipment;

public abstract class Bind {
    private Boolean fix;

    public void fixateUp(String message) {
        this.fix = true;
        fixationStart(message);
    }

    public void fixateDown(String message) {
        this.fix = false;
        fixationStop(message);
    }

    public boolean isFix() {
        return this.fix;
    }

    protected abstract void fixationStart(String message);

    protected abstract void fixationStop(String message);
}
