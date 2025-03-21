package com.example.qwer;

import jakarta.annotation.PostConstruct; // ✅ 이거 import 잊지 마!
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        System.out.println("🟢 main() 호출됨 - SpringBoot 시작 시도 중"); // ✅ main() 확인용
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

    @PostConstruct
    public void logStartup() {
        System.out.println("✅ @PostConstruct 호출됨 - SpringBoot WAR 안에서 시작됨");
    }
}
