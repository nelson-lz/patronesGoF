package py.lpz.nelson.webpattern.interceptingfilter;

import py.lpz.nelson.webpattern.http.HttpRequest;
import py.lpz.nelson.webpattern.http.HttpResponse;
import py.lpz.nelson.webpattern.http.Server;

public class FilterManager implements Server {

    @Override
    public HttpResponse submit(HttpRequest request) {
        HttpResponse response = new HttpResponse();

        FilterChain filterChain = new FilterChain(new Target()); // Se procesa el request y se establece el destino

        filterChain.addFilter(new AuthenticationFilter());     // **/** Siempre se aplica este filtro
        if ("public".equals(request.getPath(0))) { // **/public/**
            filterChain.addFilter(new TimeFilter());
        }
        if ("/public/debug".equals(request.getPath())) { // **/public/debug
            filterChain.addFilter(new DebugFilter());
        }

        filterChain.doFilter(request, response); // Se pasa el control

        return response;
    }
}
