package com.gzink.effectivejava.decorator;

import com.sun.tools.javac.util.List;
import org.junit.Test;

import java.util.HashSet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CustomSetTest {

    @Test
    public void should_instance_hashset() {
        CustomSet<String> set = new CustomSet<>(new HashSet<>());
        set.add("a");
        set.add("b");
        set.addAll(List.of("c", "d"));
        assertThat(set.getCount(), is(4));
    }
}