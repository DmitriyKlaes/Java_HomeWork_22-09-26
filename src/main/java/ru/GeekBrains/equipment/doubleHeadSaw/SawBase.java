package ru.GeekBrains.equipment.doubleHeadSaw;

import ru.GeekBrains.equipment.Base;

public class SawBase extends Base {
    private SawLeftHead headLeft;
    private SawRightHead headRight;

    protected SawBase() {
        this.headLeft = new SawLeftHead();
        this.headRight = new SawRightHead();
    }

    @Override
    protected SawLeftHead getHeadLeft() {
        return headLeft;
    }

    @Override
    protected SawRightHead getHeadRight() {
        return headRight;
    }
}
