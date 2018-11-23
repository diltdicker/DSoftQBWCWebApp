/**
 * DSoftQBWCSoapServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.dickersonsoftware.intuit;

import com.dsoft.qbwcwebapp.db.DBAccountProxy;
import com.dsoft.qbwcwebapp.db.DBProxyFactory;
import com.dsoft.qbwcwebapp.db.DBRequestProxy;
import com.dsoft.qbwcwebapp.db.DBResponseProxy;
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

        System.out.println("connectionError - " + connectionError0.getConnectionError().getTicket());

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

        System.out.println("sendRequestXML 2 - " + sendRequestXML2.getSendRequestXML().getTicket());

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

        com.intuit.developer.ServerVersionResponseDocument responseDocument = com.intuit.developer.ServerVersionResponseDocument.Factory.newInstance();
        com.intuit.developer.ServerVersionResponseDocument.ServerVersionResponse response = responseDocument.addNewServerVersionResponse();
        response.setServerVersionResult("1.2");
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

        System.out.println("getLastError 2 - " + getLastError6.getGetLastError().getTicket());

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
        DBAccountProxy accountProxy = null;
        try {
            accountProxy = DBProxyFactory.getAccounts();
            accountDocument = accountProxy.getDocument(new Document().append("username", username));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Couldn't connect to DB");
            array.setStringArray(new String[] {"nvu", ""});
        } finally {
            if (accountProxy != null) {
                accountProxy.closeDBConnection();
            }
        }
        if (accountDocument != null) {
            Account account = new Account(accountDocument);
            if (Crypto.authenticate(account.getPasshash(), password)) {
                array.setStringArray(new String[] {account.getTicket(), ""});
                DBRequestProxy requestProxy = DBProxyFactory.getRequests();
                RequestManager.getRequestManager().createRequestQueue(account.getTicket(),
                        requestProxy.getAllRequests(new Document().append("ticket", account.getTicket())));
                requestProxy.closeDBConnection();
            } else {
                array.setStringArray(new String[] {"nvu", ""});
            }
        }
        response.setAuthenticateResult(array);
        for (int i = 0; i < array.getStringArray().length; i++) {
            System.out.println(array.getStringArray(i));
        }
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

        System.out.println("receiveResponseXML - " + receiveResponseXML10.getReceiveResponseXML().getTicket());

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
        DBResponseProxy responseProxy = DBProxyFactory.getResponses();
        responseProxy.createDocument(response1.toDocument());
        responseProxy.closeDBConnection();
        System.out.println(response1.toDocument().toJson());

        DBRequestProxy requestProxy = DBProxyFactory.getRequests();
        requestProxy.deleteDocument(new Document().append("ticket",
                receiveResponseXML10.getReceiveResponseXML().getTicket()).append("reqID", request.getReqID()));
        requestProxy.closeDBConnection();
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

        System.out.println("closeConnection - " + closeConnection14.getCloseConnection().getTicket());

        com.intuit.developer.CloseConnectionResponseDocument responseDocument = com.intuit.developer.CloseConnectionResponseDocument.Factory.newInstance();
        com.intuit.developer.CloseConnectionResponseDocument.CloseConnectionResponse response = responseDocument.addNewCloseConnectionResponse();
        response.setCloseConnectionResult("Connection closed");
        return responseDocument;
    }
}
