package ru.GeekBrains;

import ru.GeekBrains.equipment.DoubleHeadSaw;

public class Program {
    public static void main(String[] args) {
        DoubleHeadSaw saw = new DoubleHeadSaw();
        saw.switchButton();
        saw.leftHeadButtonSwitch();
        saw.rightHeadButtonSwitch();
        saw.startSawing();
        saw.switchButton();
    }
}
