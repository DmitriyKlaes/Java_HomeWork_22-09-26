package ru.GeekBrains.equipment;

public abstract class Head implements Work {
    private HorizontalBind sideBind;
    private VerticalBind upperBind;
    private ProtectiveScreen screen;
    private String messageForBind;

    protected Head() {
        this.sideBind = new HorizontalBind();
        this.upperBind = new VerticalBind();
        this.screen = new ProtectiveScreen();
        this.messageForBind = setMessageForBind();
    }

    protected void activateSaw() {
        this.sideBind.fixateUp(this.messageForBind);
        this.upperBind.fixateUp(this.messageForBind);
        this.screen.protectOn(this.messageForBind);
    }

    protected void deactivateSaw() {
        this.sideBind.fixateDown(this.messageForBind);
        this.upperBind.fixateDown(this.messageForBind);
        this.screen.protectOff(this.messageForBind);
    }

    protected boolean beCareful() {
        if (sideBind.isFix() && upperBind.isFix() && screen.isProtect()) {
            System.out.printf("Защитные модули %s функционируют исправно%n", messageForBind);
            return true;
        } else {
            System.out.printf("Что-то пошло не так!!! Проверьте защитные модули %s!%n", messageForBind);
            return false;
        }
    }

    protected abstract void cutting();
    protected abstract String setMessageForBind();
}
