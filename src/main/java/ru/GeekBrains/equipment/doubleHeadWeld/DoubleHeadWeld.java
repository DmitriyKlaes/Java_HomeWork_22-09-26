package ru.GeekBrains.equipment.doubleHeadWeld;

import ru.GeekBrains.equipment.CollSticks;
import ru.GeekBrains.equipment.Machine;
import ru.GeekBrains.equipment.doubleHeadSaw.DoubleHeadSaw;

public class DoubleHeadWeld extends Machine {

    private WeldBase base;
    private WeldSwitchBoard boardSwitch;
    private WeldControlPanel panel;
//    private static CollSticks sticks;

    public DoubleHeadWeld() {
        base = new WeldBase();
        boardSwitch = new WeldSwitchBoard();
        panel = new WeldControlPanel();
//        sticks = DoubleHeadSaw.getSticks();
    }

    public void switchButton() {
        panel.buttonOnOff(boardSwitch);
    }

    public void leftHeadButtonSwitch() {
        if (boardSwitch.workCheck()) {
            panel.buttonOnOff(base.getHeadLeft());
        }
    }

    public void rightHeadButtonSwitch () {
        if (boardSwitch.workCheck()) {
            panel.buttonOnOff(base.getHeadRight());
        }
    }

    @Override
    public void oneTimeWork() {
        if (panel.leftReadyButton(base.getHeadLeft()) &&
                panel.rightReadyButton(base.getHeadRight())) {
            base.getHeadRight().activate();
            base.getHeadLeft().activate();
            if (base.getHeadLeft().beCareful() && base.getHeadRight().beCareful()) {
                base.getHeadRight().welding();
                base.getHeadLeft().welding();
            }
            base.getHeadRight().deactivateSaw();
            base.getHeadLeft().deactivateSaw();
        }
    }

    @Override
    public void startProduction() {
        while (!CollSticks.getWhipCollFoWeldWidth().isEmpty()
                && !CollSticks.getWhipCollFoWeldHeight().isEmpty()) {
            CollSticks.removeElementForWeld(CollSticks.getWhipCollFoWeldWidth(), 2);
            CollSticks.removeElementForWeld(CollSticks.getWhipCollFoWeldHeight(), 1);
            this.oneTimeWork();
            CollSticks.removeElementForWeld(CollSticks.getWhipCollFoWeldHeight(), 1);
            this.oneTimeWork();
        }
    }
}
