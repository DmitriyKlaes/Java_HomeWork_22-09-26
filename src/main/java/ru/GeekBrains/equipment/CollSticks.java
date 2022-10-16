package ru.GeekBrains.equipment;

import java.util.ArrayList;

public class CollSticks {
    private static int countWhip;
    private static ArrayList<ProfileStick> whipCollFoWeldWidth;
    private static ArrayList<ProfileStick> whipCollFoWeldHeight;
    private static ArrayList<ProfileStick> whipCollDeparture;

    static {
        countWhip = 0;
        whipCollFoWeldWidth = new ArrayList<>();
        whipCollFoWeldHeight = new ArrayList<>();
        whipCollDeparture = new ArrayList<>();
    }

    public static int getCountWhip() {
        return countWhip;
    }

    public static void setCountWhip() {
        countWhip++;
    }

    public static ArrayList<ProfileStick> getWhipCollFoWeldWidth() {
        return whipCollFoWeldWidth;
    }

    public static void setWhipCollFoWeldWidth(ProfileStick stick) {
        whipCollFoWeldWidth.add(stick);
    }

    public static ArrayList<ProfileStick> getWhipCollFoWeldHeight() {
        return whipCollFoWeldHeight;
    }

    public static void setWhipCollFoWeldHeight(ProfileStick stick) {
        whipCollFoWeldHeight.add(stick);
    }

    public static void removeElementForWeld(ArrayList<ProfileStick> listSticks, int count) {
        if (count > 0) {
            listSticks.subList(0, count).clear();
        }

    }

    public static ArrayList<ProfileStick> getWhipCollDeparture() {
        return whipCollDeparture;
    }

    public static void setWhipCollDeparture(ProfileStick stick) {
        whipCollDeparture.add(stick);
    }
}
