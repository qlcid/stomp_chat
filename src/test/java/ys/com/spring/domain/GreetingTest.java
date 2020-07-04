package ys.com.spring.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreetingTest {

    @Test
    public void lombok_greeting_test() {
        // given
        String content = "test";

        // when
        Greeting greeting = new Greeting(content);

        // then
        assertThat(greeting.getContent()).isEqualTo(content);
    }
}
