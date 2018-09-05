/**
 * DSoftQBWCSoapServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.dickersonsoftware.intuit;

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

        System.out.println("sendRequestXMLr");

        com.intuit.developer.SendRequestXMLResponseDocument responseDocument = com.intuit.developer.SendRequestXMLResponseDocument.Factory.newInstance();
        com.intuit.developer.SendRequestXMLResponseDocument.SendRequestXMLResponse response = responseDocument.addNewSendRequestXMLResponse();
        response.setSendRequestXMLResult("");
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

        System.out.println("getLastError");

        com.intuit.developer.GetLastErrorResponseDocument responseDocument = com.intuit.developer.GetLastErrorResponseDocument.Factory.newInstance();
        com.intuit.developer.GetLastErrorResponseDocument.GetLastErrorResponse response = responseDocument.addNewGetLastErrorResponse();
        response.setGetLastErrorResult("unknown error");
        return responseDocument;
    }

    /**
     * Auto generated method signature
     *
     * @param authenticate8
     * @return authenticateResponse9
     */
    public com.intuit.developer.AuthenticateResponseDocument authenticate(
        com.intuit.developer.AuthenticateDocument authenticate8) {

        System.out.println("authenticate");

        com.intuit.developer.AuthenticateResponseDocument responseDocument = com.intuit.developer.AuthenticateResponseDocument.Factory.newInstance();
        com.intuit.developer.AuthenticateResponseDocument.AuthenticateResponse response = responseDocument.addNewAuthenticateResponse();
        com.intuit.developer.ArrayOfString array = com.intuit.developer.ArrayOfString.Factory.newInstance();
        array.setStringArray(new String[] { java.util.UUID.randomUUID().toString(), ""});
        response.setAuthenticateResult(array);
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
        response.setReceiveResponseXMLResult(100);
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
