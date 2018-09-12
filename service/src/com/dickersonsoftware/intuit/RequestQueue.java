package com.dickersonsoftware.intuit;

import com.dsoft.qbwcwebapp.model.Request;

import java.util.ArrayList;

public class RequestQueue {

    private String ticket;
    private int index;
    private ArrayList<Request> requests;

    public RequestQueue(String ticket, ArrayList<Request> requests) {
        this.requests = requests;
        this.ticket = ticket;
        this.index = 0;
    }

    public String nextXMLRequest() {
        if (index > -1 && index < requests.size()) {
            index++;
            return requests.get(index - 1).buildQBXML();
        } else {
            return null;
        }
    }

    public Request nextRequest() {
        if (index > -1 && index < requests.size()) {
            index++;
            return requests.get(index - 1);
        } else {
            return null;
        }
    }

    public int getPercentComplete() {
        if (requests.size() > 0) {
            double index = this.index;
            double length = requests.size();
            double result = (index / length) * 100;
            if (result > 100) {
                result = 100;
            }
            return  (int) result;
        } else {
            return 100;
        }
    }

    public String getTicket() {
        return ticket;
    }

    public int getIndex() {
        return index;
    }

    public int getQueueSize() {
        return requests.size();
    }

    public Request getRequest(int index) {
        return requests.get(index);
    }
}
