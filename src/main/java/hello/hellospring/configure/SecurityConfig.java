package hello.hellospring.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity // 웹 보안 활성화를 위한 Annotation
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf().disable() // 사이트 간 위조 요청 disable
                .headers().frameOptions().disable() // h2-console 화면을 사용하기 위한 옵션 disable
            .and()
                .authorizeHttpRequests() // 요청에 의한 보안검사 시작
                .antMatchers("/**").permitAll() // 괄호 안 패턴에 한에서 접근 권한 승인
                .anyRequest().authenticated(); // 어떤 요청에도 보안검사를 한다.
//            .and()
//                .formLogin()
//                .loginPage("/members/login")
//                .defaultSuccessUrl("/")
//                .usernameParameter("userId")
//                .passwordParameter("password")
//                .loginProcessingUrl("/member/login")
//                .successHandler(loginSuccessHandler())
//                .failureHandler(loginFailureHandler())
//                .permitAll();


        return httpSecurity.build();
    }

//    private AuthenticationFailureHandler loginFailureHandler() {
//    }
//
//    private AuthenticationSuccessHandler loginSuccessHandler() {
//    }
}
