package org.devchw.gardener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class GithubGardenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubGardenerApplication.class, args);
    }

}
