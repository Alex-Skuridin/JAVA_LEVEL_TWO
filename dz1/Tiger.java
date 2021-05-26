package com.batiaev.java2.lesson1.homework;

public class Tiger extends Animal implements Member {

    public Tiger(String name, int age, long ability) {
        super(name, age, ability);
    }

    @Override
    public void setResult(boolean result) {
        super.setResult(result);
    }

    @Override
    public boolean getResult() {
        return super.isResult();
    }

    @Override
    public long getAbility() {
        return super.getAbility();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
