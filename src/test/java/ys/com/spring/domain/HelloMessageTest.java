package ys.com.spring.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloMessageTest {

    @Test
    public void lombok_hello_test() {
        // given
        String name = "test";

        // when
        HelloMessage helloMessage = new HelloMessage(name);

        // then
        assertThat(helloMessage.getName()).isEqualTo(name);
    }
}
