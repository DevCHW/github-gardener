package org.devchw.gardener.infra.clients.github;

import lombok.RequiredArgsConstructor;
import org.devchw.gardener.infra.clients.github.dto.Commit;
import org.devchw.gardener.infra.clients.github.dto.Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class GithubClient {

    private final GithubApi githubApi;
    private final GithubClientProperties properties;

    public List<Repository> getRepos() {
        return githubApi.getUserRepos(properties.username());
    }

    public List<Commit> getRepoCommits(String repositoryName) {
        return githubApi.getCommits(properties.username(), repositoryName);
    }

}
