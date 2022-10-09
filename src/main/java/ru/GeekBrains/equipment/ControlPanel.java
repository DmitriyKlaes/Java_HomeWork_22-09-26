package ru.GeekBrains.equipment;

public class ControlPanel {

    protected void buttonOnOff(Work obj) {
        if (obj.workCheck()) obj.switchOff();
        else obj.switchOn();
    }

    protected boolean leftReadyButton(LeftHead obj) {
        return obj.workCheck();
    }

    protected boolean rightReadyButton(RightHead obj) {
        return obj.workCheck();
    }
}
