package com.hyperskilldev.patterns.factoryMethod;

class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        BurgerStore burgerStore = new BurgerStore();
        burgerStore.orderBurger("CHINA");
        burgerStore.orderBurger("USA");
        burgerStore.orderBurger("RUS");
    }
}

abstract class BurgerFactory {

    abstract Burger createBurger(String type);

    Burger orderBurger(String type) throws InterruptedException {
        Burger burger = createBurger(type);
        if (burger == null) {
            System.out.println("Sorry, we are not able to create this kind of burger\n");
            return null;
        }
        System.out.println("Making a " + burger.getName());
        burger.putBun();
        burger.putCutlet();
        burger.putSauce();
        Thread.sleep(1500L);
        System.out.println("Done a " + burger.getName() + "\n");
        return burger;
    }
}

class BurgerStore extends BurgerFactory {
    @Override
    Burger createBurger(String type) {
        switch (type) {
            case "CHINA":
                return new ChineseBurger();
            case "USA":
                return new AmericanBurger();
            case "RUS":
                return new RussianBurger();
            default:
                return null;
        }
    }
}

abstract class Burger {
    private String name;

    Burger(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void putBun() {
        System.out.println("Putting bun");
    }

    void putCutlet() {
        System.out.println("Putting cutlet");
    }

    void putSauce() {
        System.out.println("Putting sauce");
    }

}

class ChineseBurger extends Burger {
    ChineseBurger() {
        super("Chinese Burger");
    }
}

class AmericanBurger extends Burger {
    AmericanBurger() {
        super("American Burger");
    }
}

class RussianBurger extends Burger {
    RussianBurger() {
        super("Russian Burger");
    }
}
