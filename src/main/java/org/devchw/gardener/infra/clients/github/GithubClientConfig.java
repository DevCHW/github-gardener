package org.devchw.gardener.infra.clients.github;

import feign.RequestInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

@Configuration
@RequiredArgsConstructor
class GithubClientConfig {

    private final GithubClientProperties properties;

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> requestTemplate
                .header(HttpHeaders.AUTHORIZATION, properties.token());
    }
}
