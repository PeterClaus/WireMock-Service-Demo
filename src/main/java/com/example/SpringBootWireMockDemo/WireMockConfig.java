//package com.example.SpringBootWireMockDemo;
//
//import com.github.tomakehurst.wiremock.WireMockServer;
//import com.github.tomakehurst.wiremock.client.WireMock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//
//import javax.annotation.PostConstruct;
//
//@Configuration
//public class WireMockConfig {
//
//    private final WireMockServer wireMockServer;
//
//    @Autowired
//    public WireMockConfig(WireMockServer wireMockServer) {
//        this.wireMockServer = wireMockServer;
//    }
//
//    @PostConstruct
//    public void setupStubMappings() {
//        WireMock.configureFor("localhost", wireMockServer.port());
//
//        // 设置您的Stub Mapping
//        WireMock.stubFor(WireMock.get(WireMock.urlEqualTo("/api/example"))
//                .willReturn(WireMock.aResponse()
//                        .withStatus(200)
//                        .withHeader("Content-Type", "application/json")
//                        .withBody("{\"message\": \"Hello, WireMock!\"}")));
//    }
//}
//
