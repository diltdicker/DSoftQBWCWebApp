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
     *
     * @param sendRequestXML
     */
    public com.dickersonsoftware.intuit.SendRequestXMLResponse sendRequestXML(
        com.dickersonsoftware.intuit.SendRequestXML sendRequestXML);

    /**
     * Auto generated method signature
     *
     * @param connectionError
     */
    public com.dickersonsoftware.intuit.ConnectionErrorResponse connectionError(
        com.dickersonsoftware.intuit.ConnectionError connectionError);

    /**
     * Auto generated method signature
     *
     * @param authenticate
     */
    public com.dickersonsoftware.intuit.AuthenticateResponse authenticate(
        com.dickersonsoftware.intuit.Authenticate authenticate);

    /**
     * Auto generated method signature
     *
     * @param receiveResponseXML
     */
    public com.dickersonsoftware.intuit.ReceiveResponseXMLResponse receiveResponseXML(
        com.dickersonsoftware.intuit.ReceiveResponseXML receiveResponseXML);

    /**
     * Auto generated method signature
     *
     * @param serverVersion
     */
    public com.dickersonsoftware.intuit.ServerVersionResponse serverVersion(
        com.dickersonsoftware.intuit.ServerVersion serverVersion);

    /**
     * Auto generated method signature
     *
     * @param getLastError
     */
    public com.dickersonsoftware.intuit.GetLastErrorResponse getLastError(
        com.dickersonsoftware.intuit.GetLastError getLastError);

    /**
     * Auto generated method signature
     *
     * @param closeConnection
     */
    public com.dickersonsoftware.intuit.CloseConnectionResponse closeConnection(
        com.dickersonsoftware.intuit.CloseConnection closeConnection);

    /**
     * Auto generated method signature
     *
     * @param clientVersion
     */
    public com.dickersonsoftware.intuit.ClientVersionResponse clientVersion(
        com.dickersonsoftware.intuit.ClientVersion clientVersion);
}
