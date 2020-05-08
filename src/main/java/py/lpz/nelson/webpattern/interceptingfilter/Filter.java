package py.lpz.nelson.webpattern.interceptingfilter;

import py.lpz.nelson.webpattern.http.HttpRequest;
import py.lpz.nelson.webpattern.http.HttpResponse;

public interface Filter {
    void doFilter(HttpRequest request, HttpResponse response, FilterChain filterChain);
}
