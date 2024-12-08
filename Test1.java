package com.java_8;

interface Vehicale {

    public void start();

    public default void m1() {

    }

    public default void m2() {

    }

    public static void clean() {

    }
}

class Car implements Vehicale {

    @Override
    public void start() {
        System.out.println("car start");
    }

    public static void main(String[] args) {
        Car c = new Car();
        Vehicale.clean();
        c.start();
    }

}
