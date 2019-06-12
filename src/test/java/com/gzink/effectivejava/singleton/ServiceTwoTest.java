package com.gzink.effectivejava.singleton;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ServiceTwoTest {

    @Test
    public void test_call_service_two() {
        assertThat(ServiceTwo.getInstance().getName(), is("service"));
    }
}