package ru.GeekBrains;

import ru.GeekBrains.equipment.ViewStat;
import ru.GeekBrains.equipment.doubleHeadSaw.DoubleHeadSaw;
import ru.GeekBrains.equipment.doubleHeadWeld.DoubleHeadWeld;

public class Program {
    public static void main(String[] args) {
        DoubleHeadSaw saw = new DoubleHeadSaw();
        DoubleHeadWeld weld = new DoubleHeadWeld();
        ViewStat stat = new ViewStat();

        saw.switchButton();
        saw.leftHeadButtonSwitch();
        saw.rightHeadButtonSwitch();
        saw.setProduct();
        saw.startProduction();
        saw.switchButton();

        weld.switchButton();
        weld.leftHeadButtonSwitch();
        weld.rightHeadButtonSwitch();
        weld.startProduction();
        weld.switchButton();

        stat.resultWork();
    }
}
