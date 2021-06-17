package ru.romashov.blogapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ru.romashov.blogapp.enums.ModerationStatus;
import ru.romashov.blogapp.enums.MyPostsModerationStatus;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new ModerationStatus.StringToEnumConverter());
        registry.addConverter(new MyPostsModerationStatus.StringToEnumConverter());
    }
}
