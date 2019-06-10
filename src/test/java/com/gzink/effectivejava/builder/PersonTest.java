package com.gzink.effectivejava.builder;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PersonTest {
    @Test
    public void should_create_person_with_builder() {
        Person person = Person.builder("a").sex("male").age(25).build();
        assertThat(person.getName(), is("a"));
        assertThat(person.getAge(), is(25));
        assertThat(person.getSex(), is("male"));
    }
}