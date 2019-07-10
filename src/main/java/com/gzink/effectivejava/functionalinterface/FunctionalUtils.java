package com.gzink.effectivejava.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalUtils {


    public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if (predicate.test(i)) {
                result.add(i);
            }
        }

        return result;
    }

    public static List<String> map(List<Integer> list, Function<Integer, String> function) {
        List<String> result = new ArrayList<>();
        for (Integer i : list) {
            result.add(function.apply(i));
        }
        return result;
    }
}
