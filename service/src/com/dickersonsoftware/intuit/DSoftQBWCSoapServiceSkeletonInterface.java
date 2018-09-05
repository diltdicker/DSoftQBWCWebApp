/**
 * DSoftQBWCSoapServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.dickersonsoftware.intuit;

/**
 *  DSoftQBWCSoapServiceSkeletonInterface java skeleton interface for the axisService
 */
public interface DSoftQBWCSoapServiceSkeletonInterface {
    /**
     * Auto generated method signature
     * This web method facilitates web service to handle connection error between QBWC and QB
     * @param connectionError
     */
    public com.intuit.developer.ConnectionErrorResponseDocument connectionError(
        com.intuit.developer.ConnectionErrorDocument connectionError);

    /**
     * Auto generated method signature
     * This web method facilitates web service to send request XML to QuickBooks via QBWebConnector
     * @param sendRequestXML
     */
    public com.intuit.developer.SendRequestXMLResponseDocument sendRequestXML(
        com.intuit.developer.SendRequestXMLDocument sendRequestXML);

    /**
     * Auto generated method signature
     *
     * @param serverVersion
     */
    public com.intuit.developer.ServerVersionResponseDocument serverVersion(
        com.intuit.developer.ServerVersionDocument serverVersion);

    /**
     * Auto generated method signature
     *
     * @param getLastError
     */
    public com.intuit.developer.GetLastErrorResponseDocument getLastError(
        com.intuit.developer.GetLastErrorDocument getLastError);

    /**
     * Auto generated method signature
     *
     * @param authenticate
     */
    public com.intuit.developer.AuthenticateResponseDocument authenticate(
        com.intuit.developer.AuthenticateDocument authenticate);

    /**
     * Auto generated method signature
     * This web method facilitates web service to receive response XML from QuickBooks via QBWebConnector
     * @param receiveResponseXML
     */
    public com.intuit.developer.ReceiveResponseXMLResponseDocument receiveResponseXML(
        com.intuit.developer.ReceiveResponseXMLDocument receiveResponseXML);

    /**
     * Auto generated method signature
     *
     * @param clientVersion
     */
    public com.intuit.developer.ClientVersionResponseDocument clientVersion(
        com.intuit.developer.ClientVersionDocument clientVersion);

    /**
     * Auto generated method signature
     *
     * @param closeConnection
     */
    public com.intuit.developer.CloseConnectionResponseDocument closeConnection(
        com.intuit.developer.CloseConnectionDocument closeConnection);
}
