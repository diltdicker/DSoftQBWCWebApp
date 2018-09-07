package com.dickersonsoftware.intuit;

import com.dsoft.qbwcwebapp.model.Request;

import java.util.ArrayList;

public class RequestManager {

    private static RequestManager requestManager = null;
    private ArrayList<RequestQueue> requestBin;

    private RequestManager() {
        requestBin = new ArrayList<RequestQueue>();
    }

    public static RequestManager getRequestManager() {
        if (requestManager == null) {
            requestManager = new RequestManager();
        }
        return requestManager;
    }

    public RequestQueue getRequestQueue(String token) {
        RequestQueue queue = null;
        for (int i = 0; i < requestBin.size(); i++) {
            if (requestBin.get(i).getTicket().equals(token)) {
                queue = requestBin.get(i);
                break;
            }
        }
        return queue;
    }

    public void removeRequestQueue(String token) {
        RequestQueue queue = null;
        for (int i = 0; i < requestBin.size(); i++) {
            if (requestBin.get(i).getTicket().equals(token)) {
                requestBin.remove(i);
                break;
            }
        }
    }

    public void createRequestQueue(String token, ArrayList<Request> requests) {
        RequestQueue queue = null;
        for (int i = 0; i < requestBin.size(); i++) {
            if (requestBin.get(i).getTicket().equals(token)) {
                requestBin.remove(i);
                break;
            }
        }
        requestBin.add(new RequestQueue(token, requests));
    }
}
