/**
 * DSoftQBWCSoapServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.dickersonsoftware.intuit;

import com.dsoft.qbwcwebapp.db.DBProxyFactory;
import com.dsoft.qbwcwebapp.model.Account;
import com.dsoft.qbwcwebapp.model.Request;
import com.dsoft.qbwcwebapp.model.Response;
import com.dsoft.qbwcwebapp.security.Crypto;
import com.intuit.developer.ArrayOfString;
import com.intuit.developer.AuthenticateResponseDocument;
import com.intuit.developer.SendRequestXMLResponseDocument;
import org.bson.Document;

/**
 *  DSoftQBWCSoapServiceSkeleton java skeleton for the axisService
 */
public class DSoftQBWCSoapServiceSkeleton
    implements DSoftQBWCSoapServiceSkeletonInterface {
    /**
     * Auto generated method signature
     * This web method facilitates web service to handle connection error between QBWC and QB
     * @param connectionError0
     * @return connectionErrorResponse1
     */
    public com.intuit.developer.ConnectionErrorResponseDocument connectionError(
        com.intuit.developer.ConnectionErrorDocument connectionError0) {

        System.out.println("connectionError");

        com.intuit.developer.ConnectionErrorResponseDocument responseDocument = com.intuit.developer.ConnectionErrorResponseDocument.Factory.newInstance();
        com.intuit.developer.ConnectionErrorResponseDocument.ConnectionErrorResponse response = responseDocument.addNewConnectionErrorResponse();

        connectionError0.getConnectionError().getTicket();

        response.setConnectionErrorResult("There was an error connecting");
        return responseDocument;
    }

    /**
     * Auto generated method signature
     * This web method facilitates web service to send request XML to QuickBooks via QBWebConnector
     * @param sendRequestXML2
     * @return sendRequestXMLResponse3
     */
    public com.intuit.developer.SendRequestXMLResponseDocument sendRequestXML(
        com.intuit.developer.SendRequestXMLDocument sendRequestXML2) {

        System.out.println("sendRequestXML 2");

        SendRequestXMLResponseDocument responseDocument = SendRequestXMLResponseDocument.Factory.newInstance();
        SendRequestXMLResponseDocument.SendRequestXMLResponse xmlResponse = responseDocument.addNewSendRequestXMLResponse();

        RequestQueue queue = RequestManager.getRequestManager().getRequestQueue(sendRequestXML2.getSendRequestXML().getTicket());

        if (queue.getQueueSize() > 0) {
            String req = queue.nextXMLRequest();
            xmlResponse.setSendRequestXMLResult(req);
            System.out.println(req);
        } else {
            xmlResponse.setSendRequestXMLResult("");
            System.out.println("No Requests");
        }

//        xmlResponse.setSendRequestXMLResult("");
//        return responseDocument;
//        com.intuit.developer.SendRequestXMLResponseDocument responseDocument = com.intuit.developer.SendRequestXMLResponseDocument.Factory.newInstance();
//        com.intuit.developer.SendRequestXMLResponseDocument.SendRequestXMLResponse response = responseDocument.addNewSendRequestXMLResponse();
//
//        System.out.println("getting requests");
//        Request request = RequestManager.getRequestManager().getRequestQueue(sendRequestXML2.getSendRequestXML().getTicket()).nextRequest();
//        String xml = request.buildXML();
//        if (xml != null) {
//            response.setSendRequestXMLResult(xml);
//            System.out.println("request:");
//            System.out.println(xml);
//        } else {
//            System.out.println("no request");
//            response.setSendRequestXMLResult("");
//        }
        return responseDocument;
    }

    /**
     * Auto generated method signature
     *
     * @param serverVersion4
     * @return serverVersionResponse5
     */
    public com.intuit.developer.ServerVersionResponseDocument serverVersion(
        com.intuit.developer.ServerVersionDocument serverVersion4) {

        System.out.println("serverVersion");

        com.intuit.developer.ServerVersionResponseDocument responseDocument = com.intuit.developer.ServerVersionResponseDocument.Factory.newInstance();
        com.intuit.developer.ServerVersionResponseDocument.ServerVersionResponse response = responseDocument.addNewServerVersionResponse();
        response.setServerVersionResult("1.1");
        return responseDocument;
    }

    /**
     * Auto generated method signature
     *
     * @param getLastError6
     * @return getLastErrorResponse7
     */
    public com.intuit.developer.GetLastErrorResponseDocument getLastError(
        com.intuit.developer.GetLastErrorDocument getLastError6) {

        System.out.println("getLastError 2");

        com.intuit.developer.GetLastErrorResponseDocument responseDocument = com.intuit.developer.GetLastErrorResponseDocument.Factory.newInstance();
        com.intuit.developer.GetLastErrorResponseDocument.GetLastErrorResponse response = responseDocument.addNewGetLastErrorResponse();

        String ticket = getLastError6.getGetLastError().getTicket();
        if (RequestManager.getRequestManager().getRequestQueue(ticket).getQueueSize() == 0) {
            response.setGetLastErrorResult("No Requests");
            return responseDocument;
        } else {
            response.setGetLastErrorResult("Unknown Error encountered");
            return responseDocument;
        }
    }

    /**
     * Auto generated method signature
     *
     * @param authenticate8
     * @return authenticateResponse9
     */
    public com.intuit.developer.AuthenticateResponseDocument authenticate(
        com.intuit.developer.AuthenticateDocument authenticate8) {

        System.out.println("authenticate 6");

        AuthenticateResponseDocument responseDocument = AuthenticateResponseDocument.Factory.newInstance();
        AuthenticateResponseDocument.AuthenticateResponse response = responseDocument.addNewAuthenticateResponse();
        ArrayOfString array = ArrayOfString.Factory.newInstance();
        array.setStringArray(new String[] {""});
        String username = authenticate8.getAuthenticate().getStrUserName();
        String password = authenticate8.getAuthenticate().getStrPassword();
        Document accountDocument = null;
        try {
            accountDocument = DBProxyFactory.getFactory().getAccounts().getDocument(new Document().append("username", username));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Couldn't connect to DB");
            array.setStringArray(new String[] {"nvu", ""});
        }
        if (accountDocument != null) {
            Account account = new Account(accountDocument);
            if (Crypto.authenticate(account.getPasshash(), password)) {
                array.setStringArray(new String[] {account.getTicket(), ""});
                RequestManager.getRequestManager().createRequestQueue(account.getTicket(),
                        DBProxyFactory.getFactory().getRequests().getAllRequests(new Document().append("ticket", account.getTicket())));
            } else {
                array.setStringArray(new String[] {"nvu", ""});
            }
        }
        response.setAuthenticateResult(array);
        for (int i = 0; i < array.getStringArray().length; i++) {
            System.out.println(array.getStringArray(i));
        }
//        System.out.println("username=" + username + " password=" + password);
//        System.out.println("breakpoint 1");
//        try {
//            Document accountDocument = DBProxyFactory.getFactory().getAccounts().getDocument(new Document().append("username", username));
//            System.out.println(accountDocument != null);
//            System.out.println(accountDocument.toJson());
//            Account account = new Account(accountDocument);
//            System.out.println("breakpoint 2");
//            System.out.println(account.getTicket());
//            System.out.println("breakpoint 3");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        array.setStringArray(new String[] {"8b124c93-abcd-449c-a4ea-fa70da44d75e", ""});
////        array.setStringArray(new String[] { account.getTicket(), ""});
//        response.setAuthenticateResult(array);
//        for (int i = 0; i < array.getStringArray().length; i++) {
//            System.out.println(array.getStringArray(i));
//        }
//        return responseDocument;

//        com.intuit.developer.AuthenticateResponseDocument responseDocument = com.intuit.developer.AuthenticateResponseDocument.Factory.newInstance();
//        com.intuit.developer.AuthenticateResponseDocument.AuthenticateResponse response = responseDocument.addNewAuthenticateResponse();
//        com.intuit.developer.ArrayOfString array = com.intuit.developer.ArrayOfString.Factory.newInstance();
//        String username = authenticate8.getAuthenticate().getStrUserName();
//        String password = authenticate8.getAuthenticate().getStrPassword();
//        Document accountDocument = DBProxyFactory.getFactory().getAccounts().getDocument(new Document().append("username", username));
//        if (accountDocument != null) {
//            System.out.println("2 b authenticated");
//            Account account = new Account(accountDocument);
//            if (Crypto.authenticate(account.getPasshash(), password)) {
//                System.out.println("authenticated");
//                RequestManager.getRequestManager().createRequestQueue(account.getTicket(), DBProxyFactory.getFactory()
//                        .getRequests().getAllRequests(new Document().append("ticket", account.getTicket())));
//                if (RequestManager.getRequestManager().getRequestQueue(account.getTicket()).getQueueSize() > 0) {
//                    System.out.println("added request queue");
//                    array.setStringArray(new String[] { account.getTicket(), ""});
//                } else {
//                    System.out.println("nothing in request queue");
//                    array.setStringArray(new String[] { "none", ""});
//                }
//            } else {
//                System.out.println("invalid user 2");
//                array.setStringArray(new String[] { "nvu", ""});
//            }
//        } else {
//            System.out.println("invalid user");
//            array.setStringArray(new String[] { "nvu", ""});
//        }
//        System.out.println(array.getStringArray()[0]);
//        response.setAuthenticateResult(array);
        return responseDocument;
    }

    /**
     * Auto generated method signature
     * This web method facilitates web service to receive response XML from QuickBooks via QBWebConnector
     * @param receiveResponseXML10
     * @return receiveResponseXMLResponse11
     */
    public com.intuit.developer.ReceiveResponseXMLResponseDocument receiveResponseXML(
        com.intuit.developer.ReceiveResponseXMLDocument receiveResponseXML10) {

        System.out.println("receiveResponseXML");

        com.intuit.developer.ReceiveResponseXMLResponseDocument responseDocument = com.intuit.developer.ReceiveResponseXMLResponseDocument.Factory.newInstance();
        com.intuit.developer.ReceiveResponseXMLResponseDocument.ReceiveResponseXMLResponse response = responseDocument.addNewReceiveResponseXMLResponse();

        Request request = RequestManager.getRequestManager().getRequestQueue(receiveResponseXML10.getReceiveResponseXML()
                .getTicket()).getRequest(RequestManager.getRequestManager().getRequestQueue(receiveResponseXML10.getReceiveResponseXML()
                .getTicket()).getIndex() - 1);

        String responseStr = receiveResponseXML10.getReceiveResponseXML().getResponse();
        Response response1;
        if (responseStr != null && !responseStr.equals("")) {
            response1 = new Response(request.getTicket(), responseStr, request.getReqID());
        } else {
            response1 = new Response(request.getTicket(), receiveResponseXML10.getReceiveResponseXML().getHresult() +
                    " - " + receiveResponseXML10.getReceiveResponseXML().getMessage(), request.getReqID());
        }
        DBProxyFactory.getFactory().getResponses().createDocument(response1.toDocument());
        System.out.println(response1.toDocument().toJson());

        DBProxyFactory.getFactory().getRequests().deleteDocument(new Document().append("ticket",
                receiveResponseXML10.getReceiveResponseXML().getTicket()).append("reqID", request.getReqID()));
        System.out.println(RequestManager.getRequestManager().getRequestQueue(receiveResponseXML10.getReceiveResponseXML().getTicket()).getPercentComplete());
        response.setReceiveResponseXMLResult(RequestManager.getRequestManager().getRequestQueue(receiveResponseXML10.getReceiveResponseXML().getTicket()).getPercentComplete());
        return responseDocument;
    }

    /**
     * Auto generated method signature
     *
     * @param clientVersion12
     * @return clientVersionResponse13
     */
    public com.intuit.developer.ClientVersionResponseDocument clientVersion(
        com.intuit.developer.ClientVersionDocument clientVersion12) {

        System.out.println("clientVersion");

        com.intuit.developer.ClientVersionResponseDocument responseDocument = com.intuit.developer.ClientVersionResponseDocument.Factory.newInstance();
        com.intuit.developer.ClientVersionResponseDocument.ClientVersionResponse response = responseDocument.addNewClientVersionResponse();
        response.setClientVersionResult("");
        return responseDocument;
    }

    /**
     * Auto generated method signature
     *
     * @param closeConnection14
     * @return closeConnectionResponse15
     */
    public com.intuit.developer.CloseConnectionResponseDocument closeConnection(
        com.intuit.developer.CloseConnectionDocument closeConnection14) {

        System.out.println("closeConnection");

        com.intuit.developer.CloseConnectionResponseDocument responseDocument = com.intuit.developer.CloseConnectionResponseDocument.Factory.newInstance();
        com.intuit.developer.CloseConnectionResponseDocument.CloseConnectionResponse response = responseDocument.addNewCloseConnectionResponse();
        response.setCloseConnectionResult("Connection closed");
        return responseDocument;
    }
}
