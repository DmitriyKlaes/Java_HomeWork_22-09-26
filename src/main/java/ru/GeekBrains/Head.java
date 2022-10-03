package ru.GeekBrains;

public abstract class Head  implements Work {
    protected abstract void cutting ();
    protected abstract void start ();
    protected abstract void stop ();
    protected abstract boolean isWork();
}
