//package com.example.demo;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Description;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.thymeleaf.spring6.SpringTemplateEngine;
//import org.thymeleaf.spring6.view.ThymeleafViewResolver;
//import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    @Bean
//    @Description("Thymeleaf template resolver serving HTML")
//    public ClassLoaderTemplateResolver templateResolver() {
//
//        var templateResolver = new ClassLoaderTemplateResolver();
//
//        templateResolver.setPrefix("./templates/");
//
//        templateResolver.setCacheable(false);
//
//        templateResolver.setSuffix(".html");
//
//        templateResolver.setTemplateMode("HTML");
//
//        templateResolver.setCharacterEncoding("UTF-8");
//
//        return templateResolver;
//
//    }
//
//    @Bean
//    @Description("Thymeleaf template engine with Spring integration")
//    public SpringTemplateEngine templateEngine() {
//
//        var templateEngine = new SpringTemplateEngine();
//
//        templateEngine.setTemplateResolver(templateResolver());
//
//        return templateEngine;
//
//    }
//
//    @Bean
//    @Description("Thymeleaf view resolver")
//    public ViewResolver viewResolver() {
//
//        var viewResolver = new ThymeleafViewResolver();
//
//        viewResolver.setTemplateEngine(templateEngine());
//
//        viewResolver.setCharacterEncoding("UTF-8");
//
//        return viewResolver;
//
//    }
//}
