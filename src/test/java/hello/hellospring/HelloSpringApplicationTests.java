package hello.hellospring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;

import java.util.Locale;

@SpringBootTest
class HelloSpringApplicationTests {
	@Autowired
	MessageSource ms;

	@Test
	void contextLoads() {
	}

	@Test
	void argumentsMessage() {
		String message = ms.getMessage("member.text.title", null, Locale.KOREA);
		System.out.println("message = " + message);
	}

}
