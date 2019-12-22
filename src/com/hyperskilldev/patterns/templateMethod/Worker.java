package com.hyperskilldev.patterns.templateMethod;

public abstract class Worker {

    public void work() {
        goToWork();

        workingProcess();

        goHome();
    }

    public void goToWork() {
        System.out.println("= I'm going to work sadly =");
    }

    public void goHome() {
        System.out.println("= I'm going home happy =");
    }

    public abstract void workingProcess();
}