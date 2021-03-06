package scmspain.karyon.restrouter.transport.http;

import io.reactivex.netty.protocol.http.server.HttpServerRequest;
import io.reactivex.netty.protocol.http.server.HttpServerResponse;
import rx.Observable;

public interface RouteHandler<I, O> {

  Observable<Object> process(HttpServerRequest<I> request, HttpServerResponse<O> response);
}
