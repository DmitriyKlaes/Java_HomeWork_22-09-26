package ru.GeekBrains.equipment.doubleHeadSaw;

import ru.GeekBrains.equipment.ControlPanel;
import ru.GeekBrains.equipment.Window;

public class SawControlPanel extends ControlPanel {
    private Window window;

    public SawControlPanel() {
        this.window = new Window();
    }

    protected void setWindow(int width, int height, int count) {
        window.setWidth(width);
        window.setHeight(height);
        window.setCount(count);
    }

    protected Window getWindow() {
        return window;
    }
}
