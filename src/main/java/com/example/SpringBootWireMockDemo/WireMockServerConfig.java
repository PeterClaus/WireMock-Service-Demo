package com.example.SpringBootWireMockDemo;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
public class WireMockServerConfig {

    @Value("${wiremock.port}") // 从配置文件中获取WireMock服务的端口
    private int wireMockPort;

    private WireMockServer wireMockServer;

    @PostConstruct
    public void startWireMockServer() {
        System.out.println("WireMock is running on port: " + wireMockPort);
        wireMockServer = new WireMockServer(WireMockConfiguration.options().port(wireMockPort)
                .withRootDirectory("src/main/resources"));
        wireMockServer.start();
    }

    @PreDestroy
    public void stopWireMockServer() {
        wireMockServer.stop();
    }

    @Bean
    public WireMockServer wireMockServer() {
        return wireMockServer;
    }
}

