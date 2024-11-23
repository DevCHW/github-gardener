package org.devchw.gardener.infra.clients.github.dto;

public record Commit(
        String sha,
        String nodeId,
        CommitDetail commit
) {
    public record CommitDetail(
            Author author,
            Committer committer,
            String message
    ) {
        public record Author(
                String name,
                String email,
                String date
        ) {}

        public record Committer(
                String name,
                String email,
                String date
        ) {}
    }
}
