package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Locale;
import java.util.Objects;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(@RequestParam(value = "lang", required = false) String lang, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        if (Objects.equals(lang, "en") ) {
            Locale locale = new Locale(lang);
            LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
            Objects.requireNonNull(localeResolver).setLocale(request, response, locale);
        } else {
            lang = "ko";
            Locale locale = new Locale(lang);
            LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
            Objects.requireNonNull(localeResolver).setLocale(request, response, locale);
        }
        return "home";
    }
}
