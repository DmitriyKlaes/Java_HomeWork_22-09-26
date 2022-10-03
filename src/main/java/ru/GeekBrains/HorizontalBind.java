package ru.GeekBrains;

public class HorizontalBind extends Bind {

    private boolean fix;

    public void setFix(boolean fix) {
        this.fix = fix;
    }

    @Override
    protected boolean fixation() {
        return this.fix;
    }
}
