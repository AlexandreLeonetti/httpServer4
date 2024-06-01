package javaserver4e;


public interface HttpServer {

    void start(HttpRequestHandler handler);

    void stop();
}