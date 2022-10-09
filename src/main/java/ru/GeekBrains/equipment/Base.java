package ru.GeekBrains.equipment;

public class Base {
    private LeftHead headLeft;
    private RightHead headRight;

    protected Base() {
        this.headLeft = new LeftHead();
        this.headRight = new RightHead();
    }

    protected LeftHead getHeadLeft() {
        return headLeft;
    }

    protected RightHead getHeadRight() {
        return headRight;
    }
}
