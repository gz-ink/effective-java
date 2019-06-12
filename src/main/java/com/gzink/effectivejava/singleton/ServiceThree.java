package com.gzink.effectivejava.singleton;

public enum ServiceThree {
    INSTANCE;

    private static final String name = "service";

    public String getName() {
        return name;
    }
}
