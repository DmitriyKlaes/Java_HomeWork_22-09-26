package ru.GeekBrains.equipment;

public class ProfileStick {
    private int size;

    public ProfileStick() {
        this.size = 6000;
    }

    public ProfileStick(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return Integer.toString(size);
    }
}
