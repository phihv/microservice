//package com.gam.erp.gateway.filter;
//
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.core.Ordered;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
//@Component
//public class LoggingFilter implements GlobalFilter, Ordered {
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, org.springframework.cloud.gateway.filter.GatewayFilterChain chain) {
//        var request = exchange.getRequest();
//        System.out.println("---> REQUEST: " + request.getMethod() + " " + request.getURI());
//
//        return chain.filter(exchange).then(Mono.fromRunnable(() -> {
//            var response = exchange.getResponse();
//            System.out.println("<--- RESPONSE: " + response.getStatusCode());
//        }));
//    }
//
//    @Override
//    public int getOrder() {
//        return -1;
//    }
//}
