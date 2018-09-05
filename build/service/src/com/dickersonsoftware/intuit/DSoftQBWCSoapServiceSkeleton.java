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
     *
     * @param sendRequestXML0
     * @return sendRequestXMLResponse1
     */
    public com.dickersonsoftware.intuit.SendRequestXMLResponse sendRequestXML(
        com.dickersonsoftware.intuit.SendRequestXML sendRequestXML0) {

        System.out.println("Send Request");
        com.dickersonsoftware.intuit.SendRequestXMLResponse response = new SendRequestXMLResponse();
        response.setSendRequestXMLResult("");
        return response;
    }

    /**
     * Auto generated method signature
     *
     * @param connectionError2
     * @return connectionErrorResponse3
     */
    public com.dickersonsoftware.intuit.ConnectionErrorResponse connectionError(
        com.dickersonsoftware.intuit.ConnectionError connectionError2) {

        System.out.println("Connection Error");
        com.dickersonsoftware.intuit.ConnectionErrorResponse response = new ConnectionErrorResponse();
        response.setConnectionErrorResult("There was aConnection Error");
        return response;
    }

    /**
     * Auto generated method signature
     *
     * @param authenticate4
     * @return authenticateResponse5
     */
    public com.dickersonsoftware.intuit.AuthenticateResponse authenticate(
        com.dickersonsoftware.intuit.Authenticate authenticate4) {

        System.out.println("Authenticate");
        com.dickersonsoftware.intuit.AuthenticateResponse response = new AuthenticateResponse();
        com.dickersonsoftware.intuit.ArrayOfString array = new ArrayOfString();
        if (authenticate4.getStrUserName().equals("dsoftclient") && authenticate4.getStrPassword().equals("password")) {
            array.addString(java.util.UUID.randomUUID().toString());
            array.addString("");
        } else {
            array.addString("NVU");
            array.addString("");
        }
        response.setAuthenticateResult(array);
        return response;
    }

    /**
     * Auto generated method signature
     *
     * @param receiveResponseXML6
     * @return receiveResponseXMLResponse7
     */
    public com.dickersonsoftware.intuit.ReceiveResponseXMLResponse receiveResponseXML(
        com.dickersonsoftware.intuit.ReceiveResponseXML receiveResponseXML6) {

        System.out.println("Receive Response");
        com.dickersonsoftware.intuit.ReceiveResponseXMLResponse response = new ReceiveResponseXMLResponse();
        response.setReceiveResponseXMLResult(100);
        return response;
    }

    /**
     * Auto generated method signature
     *
     * @param serverVersion8
     * @return serverVersionResponse9
     */
    public com.dickersonsoftware.intuit.ServerVersionResponse serverVersion(
        com.dickersonsoftware.intuit.ServerVersion serverVersion8) {

        System.out.println("Server Version");
        com.dickersonsoftware.intuit.ServerVersionResponse response = new ServerVersionResponse();
        response.setServerVersionResult("1.0");
        return response;
    }

    /**
     * Auto generated method signature
     *
     * @param getLastError10
     * @return getLastErrorResponse11
     */
    public com.dickersonsoftware.intuit.GetLastErrorResponse getLastError(
        com.dickersonsoftware.intuit.GetLastError getLastError10) {

        System.out.println("Get Last Error");
        com.dickersonsoftware.intuit.GetLastErrorResponse response = new GetLastErrorResponse();
        response.setGetLastErrorResult("There was an Error");
        return response;
    }

    /**
     * Auto generated method signature
     *
     * @param closeConnection12
     * @return closeConnectionResponse13
     */
    public com.dickersonsoftware.intuit.CloseConnectionResponse closeConnection(
        com.dickersonsoftware.intuit.CloseConnection closeConnection12) {

        System.out.println("Close Connection");
        com.dickersonsoftware.intuit.CloseConnectionResponse response = new CloseConnectionResponse();
        response.setCloseConnectionResult("The Connection for the QBWC has been closed");
        return response;
    }

    /**
     * Auto generated method signature
     *
     * @param clientVersion14
     * @return clientVersionResponse15
     */
    public com.dickersonsoftware.intuit.ClientVersionResponse clientVersion(
        com.dickersonsoftware.intuit.ClientVersion clientVersion14) {

        System.out.println("Client Version");
        com.dickersonsoftware.intuit.ClientVersionResponse response = new ClientVersionResponse();
        response.setClientVersionResult("");
        return response;
    }
}
