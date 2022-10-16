package ru.GeekBrains.equipment;

public abstract class ControlPanel implements ReadyButtons {
    public void buttonOnOff(Work obj) {
        if (obj.workCheck()) obj.switchOff();
        else obj.switchOn();
    }
}
