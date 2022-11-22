package hello.hellospring.configure;
//
//import hello.hellospring.service.MemberService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.AuthenticationFailureHandler;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.stereotype.Service;
//
//@Configuration
//@EnableWebSecurity // 웹 보안 활성화를 위한 Annotation
//public class SecurityConfig {
//    @Autowired
//    UserDetailsService userDetailsService;
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
////        httpSecurity
////                .rememberMe() // rememberMe 기능 작동
////                .key("rememberMeTest")
////                .rememberMeParameter("remember-me") // 기본 파라미터 명은 remember-me
////                .tokenValiditySeconds(3600) // 기본값은 14일
////                .alwaysRemember(true) // rememberMe 기능이 활성화되지 않아도 항상 실행. 기본값은 false
////                .userDetailsService(userDetailsService) // rememberMe에서 시스템에 있는 사용자 계정을 조회할 때 사용할 클래스
////            .and()
////                .csrf().disable() // 사이트 간 위조 요청 disable
////                .headers().frameOptions().disable() // h2-console 화면을 사용하기 위한 옵션 disable
////            .and()
////                .authorizeHttpRequests() // 요청에 의한 보안검사 시작
////                .antMatchers("/**").permitAll() // 괄호 안 패턴에 한에서 접근 권한 승인
////                .anyRequest().authenticated(); // 어떤 요청에도 보안검사를 한다.
////            .and()
////                .formLogin()
////                .loginPage("/members/login")
////                .defaultSuccessUrl("/")
////                .usernameParameter("userId")
////                .passwordParameter("password")
////                .loginProcessingUrl("/member/login")
////                .successHandler(loginSuccessHandler())
////                .failureHandler(loginFailureHandler())
////                .permitAll();
//
//
//        return httpSecurity.build();
//    }
//
////    private AuthenticationFailureHandler loginFailureHandler() {
////    }
////
////    private AuthenticationSuccessHandler loginSuccessHandler() {
////    }
//}
