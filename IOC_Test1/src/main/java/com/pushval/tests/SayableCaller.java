package com.pushval.tests;

public class SayableCaller {
    Sayable sayable;

    public void setSayable(Sayable sayable) {
        this.sayable = sayable;
    }

    public void say() {
        sayable.say();
    }
}
