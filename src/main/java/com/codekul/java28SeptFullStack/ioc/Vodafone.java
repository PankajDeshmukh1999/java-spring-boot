package com.codekul.java28SeptFullStack.ioc;

public class Vodafone implements Sim{
    @Override
    public void calling() {
        System.out.println("Vodafone calling");
    }

    @Override
    public void data() {
        System.out.println("Vodafone data");
    }
}
