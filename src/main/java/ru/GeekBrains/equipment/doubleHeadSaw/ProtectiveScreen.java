package ru.GeekBrains.equipment.doubleHeadSaw;

public class ProtectiveScreen {
    private boolean protect;

    public void protectOn(String side) {
        this.protect = true;
        System.out.printf("Защитный экран %s опущен%n", side);
    }

    public void protectOff(String side) {
        this.protect = false;
        System.out.printf("Защитный экран %s поднят%n", side);
    }

    public boolean isProtect() {
        return protect;
    }
}
