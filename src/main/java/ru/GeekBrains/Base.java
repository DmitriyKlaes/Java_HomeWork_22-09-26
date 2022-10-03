package ru.GeekBrains;

public class Base {
    private Switchboard boardSwitch;
    private LeftHead headLeft;
    private RightHead headRight;
    private ControlPanel panel;

    public Base() {
        boardSwitch = new Switchboard();
        headLeft = new LeftHead();
        headRight = new RightHead();
        panel = new ControlPanel();
    }

    public void switchButton () {
        panel.workButton(boardSwitch);
        panel.workButtonHead(headLeft);
        panel.workButtonHead(headRight);
    }

//    protected void startCollector (Collector obj) {
//        obj.start();
//    }
//
//    protected void stopCollector (Collector obj) {
//        obj.stop();
//    }


}

