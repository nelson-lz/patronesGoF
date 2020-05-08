package py.lpz.nelson.webpattern.interceptingfilter;

import py.lpz.nelson.webpattern.http.HttpRequest;
import py.lpz.nelson.webpattern.http.HttpResponse;
import org.apache.logging.log4j.LogManager;

public class Target {
    public void execute(HttpRequest request, HttpResponse response) {
        LogManager.getLogger(this.getClass().getName()).info("---------> Executing TARGET." + request);
    }
}
