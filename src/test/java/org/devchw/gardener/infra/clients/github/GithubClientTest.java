package org.devchw.gardener.infra.clients.github;

import org.assertj.core.api.Assertions;
import org.devchw.gardener.infra.clients.github.dto.Commit;
import org.devchw.gardener.infra.clients.github.dto.Repository;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.*;

@SpringBootTest
class GithubClientTest {

    @Mock
    private GithubApi githubApi;

    @Mock
    private GithubClientProperties properties;

    @InjectMocks
    private GithubClient githubClient;

    @Test
    void getRepos() {
        // given
        given(properties.username())
                .willReturn("username");

        given(githubApi.getUserRepos(anyString()))
                .willReturn(new ArrayList<>());
        // when
        List<Repository> result = githubClient.getRepos();

        // then
        assertThat(result).hasSize(0);
    }

    @Test
    void getCommits() {
        // given
        given(githubApi.getCommits(anyString(), anyString()))
                .willReturn(new ArrayList<>());

        // when
        List<Commit> result = githubClient.getRepoCommits("repositoryName");

        // then
        assertThat(result).hasSize(0);
    }
}