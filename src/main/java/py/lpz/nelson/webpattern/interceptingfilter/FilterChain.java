package py.lpz.nelson.webpattern.interceptingfilter;

import py.lpz.nelson.webpattern.http.HttpRequest;
import py.lpz.nelson.webpattern.http.HttpResponse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilterChain {
    private List<Filter> filters;

    private Target target;

    private Iterator<Filter> iterator;

    public FilterChain(Target target) {
        this.target = target;
        filters = new ArrayList<>();
        iterator = filters.iterator();
    }

    public void addFilter(Filter filter) {
        filters.add(filter);
        iterator = filters.iterator();
    }

    public void doFilter(HttpRequest request, HttpResponse response) {
        if (iterator.hasNext()) {
            iterator.next().doFilter(request, response, this);
        } else {
            target.execute(request, response);
        }
    }
}