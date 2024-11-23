package org.devchw.gardener.infra.clients.github;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "github")
public record GithubClientProperties(
        String token,
        String username
) {
}
