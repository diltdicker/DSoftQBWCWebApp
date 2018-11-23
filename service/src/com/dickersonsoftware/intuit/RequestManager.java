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

    public RequestQueue getRequestQueue(String ticket) {
        RequestQueue queue = null;
        for (int i = 0; i < requestBin.size(); i++) {
            if (requestBin.get(i).getTicket().equals(ticket)) {
                queue = requestBin.get(i);
                break;
            }
        }
        return queue;
    }

    public void removeRequestQueue(String ticket) {
        RequestQueue queue = null;
        for (int i = 0; i < requestBin.size(); i++) {
            if (requestBin.get(i).getTicket().equals(ticket)) {
                requestBin.remove(i);
                break;
            }
        }
    }

    public void createRequestQueue(String ticket, ArrayList<Request> requests) {
        RequestQueue queue = null;
        for (int i = 0; i < requestBin.size(); i++) {
            if (requestBin.get(i).getTicket().equals(ticket)) {
                requestBin.remove(i);
                break;
            }
        }
        requestBin.add(new RequestQueue(ticket, requests));
    }
}
