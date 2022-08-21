package hello.hellospring.configure;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Configuration
public class LocaleConfig implements WebMvcConfigurer {
    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        sessionLocaleResolver.setDefaultLocale(Locale.KOREA);
        sessionLocaleResolver.setLocaleAttributeName("sessionLang");

        return sessionLocaleResolver;
    }

    @Bean
    public MessageSource messageSource(
            @Value("${spring.messages.basename}") String basename,
            @Value("${spring.messages.encoding}") String encoding
    ) {
        ResourceBundleMessageSource resourceBundleMessageSource = new ResourceBundleMessageSource();
        resourceBundleMessageSource.setBasename(basename);
        resourceBundleMessageSource.setDefaultEncoding(encoding);

        return resourceBundleMessageSource;
    }

    @Bean
    public MessageSourceAccessor messageSourceAccessor(
            @Qualifier("messageSource") MessageSource messageSource
    ) {
        return new MessageSourceAccessor(messageSource);
    }
}
