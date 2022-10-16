package ru.GeekBrains.equipment;

public abstract class Head implements Work {
    private VerticalBind upperBind;
    private String messageForBind;

    protected Head() {
        this.upperBind = new VerticalBind();
        this.messageForBind = setMessageForBind();
    }

    public VerticalBind getUpperBind() {
        return upperBind;
    }

    public void activate() {
        this.upperBind.fixateUp(this.messageForBind);
    }

    public void deactivateSaw() {
        this.upperBind.fixateDown(this.messageForBind);
    }

    protected abstract String setMessageForBind();
}
