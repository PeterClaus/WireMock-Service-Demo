//package com.example.SpringBootWireMockDemo;
//import com.github.tomakehurst.wiremock.WireMockServer;
//import com.github.tomakehurst.wiremock.client.WireMock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//@Service
//public class MyService {
//
//    private final WireMockServer wireMockServer;
//
//    @Autowired
//    public MyService(WireMockServer wireMockServer) {
//        this.wireMockServer = wireMockServer;
//    }
//
//    public void makeWireMockCall() {
//        WireMock.configureFor("localhost", wireMockServer.port());
//
//        // 发起WireMock服务的HTTP调用
//        // 例如：使用RestTemplate或其他HTTP客户端进行调用
//        RestTemplate restTemplate = new RestTemplate();
//        String url = "http://localhost:" + wireMockServer.port() + "/api/example";
//
//        String response = restTemplate.getForObject(url, String.class);
//        // 处理响应...
//    }
//}
//
