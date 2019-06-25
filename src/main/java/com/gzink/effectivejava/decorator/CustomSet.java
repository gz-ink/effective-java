package com.gzink.effectivejava.decorator;

import java.util.Collection;
import java.util.Set;

public class CustomSet<E> extends ForwardingSet<E> {

    private Integer count = 0;

    public CustomSet(Set<E> set) {
        super(set);
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public boolean add(E e) {
        count ++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        count += c.size();
        return super.addAll(c);
    }
}
