package org.devchw.gardener.config.feign;

import feign.Client;
import feign.okhttp.OkHttpClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "org.devchw.gardener")
public class FeignConfig {

    @Bean
    public Client okHttpClient() {
        return new OkHttpClient();
    }

}
