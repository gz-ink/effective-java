package com.gzink.effectivejava.singleton;

public class ServiceTwo {
    private static final ServiceTwo INSTANCE = new ServiceTwo("service");
    private final String name;

    private ServiceTwo(String name) {
        this.name = name;
    }

    public static ServiceTwo getInstance() {
        return INSTANCE;
    }

    public String getName() {
        return name;
    }
}
