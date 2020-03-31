package com.hyperskilldev.absractclasses;

public class WhichMethodsMustBeOverriding {
}
abstract class A {

    public static void staticFoo() { }

    public void instanceBar() { }

    public abstract void abstractFoo();

    public abstract void abstractBar();
}

abstract class B extends A {

    public static void anotherStaticFoo() { }

    public void anotherInstanceBar() { }

    @Override
    public void abstractBar() { }

    public abstract void qq();
}

class C extends B {
    @Override
    public void abstractFoo() {

    }

    @Override
    public void qq() {

    }
}