package ys.com.spring.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
public class HelloMessage {
    private String name;

    public HelloMessage() {
    }

    public HelloMessage(String name) {
        this.name = name;
    }
}
