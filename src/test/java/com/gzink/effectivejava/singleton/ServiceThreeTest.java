package com.gzink.effectivejava.singleton;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ServiceThreeTest {
    @Test
    public void test_call_service_three() {
        assertThat(ServiceThree.INSTANCE.getName(), is("service"));
    }
}