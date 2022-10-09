package ru.GeekBrains.equipment;

public abstract class Bind {
    private Boolean fix;

    protected void fixateUp(String message) {
        this.fix = true;
        fixationStart(message);
    }

    protected void fixateDown(String message) {
        this.fix = false;
        fixationStop(message);
    }

    protected boolean isFix() {
        return this.fix;
    }

    protected abstract void fixationStart(String message);

    protected abstract void fixationStop(String message);
}
