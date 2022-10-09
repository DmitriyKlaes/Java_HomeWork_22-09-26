package ru.GeekBrains.equipment;

public class DoubleHeadSaw {

    private Base base;
    private Switchboard boardSwitch;
    private ControlPanel panel;
    private Collector dustCollector;

    public DoubleHeadSaw() {
        base = new Base();
        boardSwitch = new Switchboard();
        dustCollector = new Collector();
        panel = new ControlPanel();
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

    public void startSawing () {
        if (panel.leftReadyButton(base.getHeadLeft()) &&
                panel.rightReadyButton(base.getHeadRight())) {
            base.getHeadRight().activateSaw();
            base.getHeadLeft().activateSaw();
            dustCollector.start();
            if (base.getHeadLeft().beCareful() && base.getHeadRight().beCareful()) {
                base.getHeadRight().cutting();
                base.getHeadLeft().cutting();
            }
            base.getHeadRight().deactivateSaw();
            base.getHeadLeft().deactivateSaw();
            dustCollector.stop();
        }
    }
}

