HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create("https://httpbin.org/headers"))
    .header("accept", "text/json")
    .header("x-foo", "Bar")
    .method("GET", HttpRequest.BodyPublishers.noBody())
    .build();
HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
System.out.println(response.body());
