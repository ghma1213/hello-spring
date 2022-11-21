package hello.hellospring;

import hello.hellospring.study.LottoNumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;

import java.util.List;
import java.util.Locale;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

	@DisplayName("로또 번호 갯수 테스트")
	@Test
	void lottoNumberSizeTest() {
		// given
		final LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
//		final int price = 1000;
		final int price = 2000;

		// when
//		final List<Integer> lottoNumber = lottoNumberGenerator.generate(price);
		final RuntimeException exception = assertThrows(RuntimeException.class, () -> lottoNumberGenerator.generate(price));

		// then
//		assertThat(lottoNumber.size()).isEqualTo(6);
//		assertThat(lottoNumber.stream().allMatch(v -> v >= 1 && v <= 45)).isTrue();
		assertThat(exception.getMessage()).isEqualTo("올바른 금액이 아닙니다.");
	}

}
