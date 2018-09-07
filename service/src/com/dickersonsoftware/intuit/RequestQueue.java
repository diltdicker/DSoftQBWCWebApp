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
        if (index != requests.size()) {
            index++;
            return requests.get(index - 1).buildXML();
        } else {
            return null;
        }
    }

    public int getPercentComplete() {
        double index = this.index;
        double length = requests.size();
        double result = (index / length) * 100;
        return  (int) result;
    }

    public String getTicket() {
        return ticket;
    }

    public int getIndex() {
        return index;
    }

    public Request getRequest(int index) {
        return requests.get(index);
    }
}
