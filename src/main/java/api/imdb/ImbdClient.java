package api.imdb;

public class ImbdClient {
    ImbdClient client = new ImbdClient.Builder()
            .baseUrl("https://imdb-api.com")
            .build();

    GitHubService service = retrofit.create(GitHubService.class);
}
