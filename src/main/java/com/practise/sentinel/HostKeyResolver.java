package com.practise.sentinel;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 限流关键字
 *
 * @author longyulan
 * @date 2023/4/23
 */
@Component
public class HostKeyResolver implements KeyResolver {

    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        return Mono.just(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
    }

    //@Bean
    //public HostKeyResolver hostKeyResolver() {
    //    return new HostKeyResolver();
    //}
}
