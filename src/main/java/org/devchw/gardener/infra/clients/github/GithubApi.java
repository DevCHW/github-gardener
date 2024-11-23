package org.devchw.gardener.infra.clients.github;

import org.devchw.gardener.infra.clients.github.dto.Commit;
import org.devchw.gardener.infra.clients.github.dto.Repository;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

@FeignClient(value = "https://api.github.com", configuration = GithubClientConfig.class)
interface GithubApi {

    @GetMapping("/users/{username}/repos")
    List<Repository> getUserRepos(@PathVariable String username);

    @GetMapping("/repos/{username}/{repo}/commits")
    List<Commit> getCommits(@PathVariable String username,
                            @PathVariable String repo);

}
