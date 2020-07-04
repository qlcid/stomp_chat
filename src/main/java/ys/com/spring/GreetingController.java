package ys.com.spring;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;
import ys.com.spring.domain.Chat;
import ys.com.spring.domain.Greeting;
import ys.com.spring.domain.HelloMessage;

//@RestController
@Controller
public class GreetingController {

    @MessageMapping("/hello")       // /hello로 메세지를 전달하면 greeting 메서드가 실행
    @SendTo("/topic/greetings")     // 이 메서드는 다시 SendTo에 정의된 쪽으로 return
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(100);

        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()));
        // Greeting 객체를 만들어 /topic/greetings의 구독자에게 브로드캐스팅
    }

    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public Chat chat(Chat chat) throws Exception {
        return new Chat(chat.getName(), chat.getMessage());
    }
}
