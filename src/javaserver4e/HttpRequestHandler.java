package javaserver4e;


public interface HttpRequestHandler {
    HttpResponse handle(HttpRequest request);
}