package com.gzink.effectivejava.functionalinterface;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class FunctionalUtilsTest {

    @Test
    public void should_filter_list() {
        List<Integer> list = Arrays.asList(1, -2, 4, 5);
        Predicate<Integer> predicate = (Integer a) -> a > 0;
        List<Integer> result = FunctionalUtils.filter(list, predicate);
        assertThat(result, is(Arrays.asList(1, 4, 5)));
    }

    @Test
    public void should_map_integer_to_string() {
        List<Integer> list = Arrays.asList(1, 13, 5, 22);
        Function<Integer, String> function = (Integer a) -> a > 10 ? "L" : "S";
        List<String> result = FunctionalUtils.map(list, function);
        assertThat(result, is(Arrays.asList("S", "L", "S", "L")));
    }

    @Test
    public void should_runnable_add_to_list() {
        List<Integer> list = new ArrayList<>();
        Runnable runnable = () -> list.add(3);
        runnable.run();
        assertThat(list, is(Arrays.asList(3)));
    }
}