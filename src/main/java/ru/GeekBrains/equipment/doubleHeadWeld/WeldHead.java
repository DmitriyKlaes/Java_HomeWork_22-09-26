package ru.GeekBrains.equipment.doubleHeadWeld;

import ru.GeekBrains.equipment.Head;

public abstract class WeldHead extends Head {
    private String messageForBind;

    protected WeldHead() {
        super();
        this.messageForBind = setMessageForBind();
    }

    public boolean beCareful() {
        if (getUpperBind().isFix()) {
            System.out.printf("Защитные модули %s функционируют исправно%n", messageForBind);
            return true;
        } else {
            System.out.printf("Что-то пошло не так!!! Проверьте защитные модули %s!%n", messageForBind);
            return false;
        }
    }
    protected abstract void welding();
}
