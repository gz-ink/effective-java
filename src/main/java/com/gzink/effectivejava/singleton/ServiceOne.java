package com.gzink.effectivejava.singleton;

public class ServiceOne {

    public static final ServiceOne INSTANCE = new ServiceOne("service");

    private String name;
    private ServiceOne(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
