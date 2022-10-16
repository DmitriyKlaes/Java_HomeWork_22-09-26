package ru.GeekBrains.equipment.doubleHeadSaw;

import ru.GeekBrains.equipment.Head;

public abstract class SawHead extends Head {
    private HorizontalBind sideBind;
    private ProtectiveScreen screen;
    private String messageForBind;

    protected SawHead() {
        super();
        this.sideBind = new HorizontalBind();
        this.screen = new ProtectiveScreen();
        this.messageForBind = setMessageForBind();
    }
    @Override
    public void activate() {
        super.activate();
        this.sideBind.fixateUp(this.messageForBind);
        this.screen.protectOn(this.messageForBind);
    }

    @Override
    public void deactivateSaw() {
        super.activate();
        this.sideBind.fixateDown(this.messageForBind);
        this.screen.protectOff(this.messageForBind);
    }

    public boolean beCareful() {
        if (sideBind.isFix() && getUpperBind().isFix() && screen.isProtect()) {
            System.out.printf("Защитные модули %s функционируют исправно%n", messageForBind);
            return true;
        } else {
            System.out.printf("Что-то пошло не так!!! Проверьте защитные модули %s!%n", messageForBind);
            return false;
        }
    }
    protected abstract void cutting();

}
