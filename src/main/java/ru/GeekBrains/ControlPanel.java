package ru.GeekBrains;

public class ControlPanel {

    protected void workButton (Switchboard obj) {
        if (obj.isWork()) obj.stop();
        else obj.start();
    }

    protected void workButtonHead (Head obj) {
        if (obj.isWork()) obj.stop();
        else obj.start();
    }




}
