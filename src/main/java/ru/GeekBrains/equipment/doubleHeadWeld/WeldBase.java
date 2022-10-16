package ru.GeekBrains.equipment.doubleHeadWeld;

import ru.GeekBrains.equipment.Base;

public class WeldBase extends Base {
    private WeldLeftHead headLeft;
    private WeldRightHead headRight;

    protected WeldBase() {
        this.headLeft = new WeldLeftHead();
        this.headRight = new WeldRightHead();
    }

    @Override
    protected WeldLeftHead getHeadLeft() {
        return headLeft;
    }

    @Override
    protected WeldRightHead getHeadRight() {
        return headRight;
    }
}
