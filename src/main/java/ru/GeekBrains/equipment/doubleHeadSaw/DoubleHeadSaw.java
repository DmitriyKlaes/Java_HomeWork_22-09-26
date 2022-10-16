package ru.GeekBrains.equipment.doubleHeadSaw;

import ru.GeekBrains.equipment.Machine;
import ru.GeekBrains.equipment.ProfileStick;
import ru.GeekBrains.equipment.CollSticks;

import java.util.Scanner;

public class DoubleHeadSaw extends Machine {

    private SawBase base;
    private SawSwitchBoard boardSwitch;
    private SawControlPanel panel;
    private Collector dustCollector;
    private Scanner scn;
//    private static CollSticks sticks;

    public DoubleHeadSaw() {
        base = new SawBase();
        boardSwitch = new SawSwitchBoard();
        dustCollector = new Collector();
        panel = new SawControlPanel();
        scn = new Scanner(System.in);
//        sticks = new CollSticks();
    }

//    public static CollSticks getSticks() {
//        return sticks;
//    }

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

    public void setProduct () {
        System.out.print("Введите ширину окна: ");
        int width = scn.nextInt();
        System.out.print("Введите высоту окна: ");
        int height = scn.nextInt();
        System.out.print("Введите колличество таких окон: ");
        int count = scn.nextInt();
        panel.setWindow(width, height, count);
    }

    @Override
    public void oneTimeWork() {
        if (panel.leftReadyButton(base.getHeadLeft()) &&
                panel.rightReadyButton(base.getHeadRight())) {
            base.getHeadRight().activate();
            base.getHeadLeft().activate();
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

    @Override
    public void startProduction() {
        int width = panel.getWindow().getWidth();
        int height = panel.getWindow().getHeight();
        int allWidth = width * panel.getWindow().getCount() * 2;
        int allHeight = height * panel.getWindow().getCount() * 2;
        ProfileStick stick = new ProfileStick();
        while (allWidth > 0 || allHeight > 0) {
            if (stick.getSize() >= width && allWidth > 0) {
                this.oneTimeWork();
                stick.setSize(stick.getSize() - width);
                allWidth -= width;
                CollSticks.setWhipCollFoWeldWidth(new ProfileStick(width));
            } else if (stick.getSize() >= height) {
                this.oneTimeWork();
                stick.setSize(stick.getSize() - height);
                allHeight -= height;
                CollSticks.setWhipCollFoWeldHeight(new ProfileStick(height));
            } else {
                CollSticks.setCountWhip();
                if (stick.getSize() != 0) CollSticks.setWhipCollDeparture(stick);
                stick = new ProfileStick();
            }
        }
        if (stick.getSize() != 0) {
            CollSticks.setCountWhip();
            CollSticks.setWhipCollDeparture(stick);
        }
    }
}

