/**
 * DSoftQBWCSoapServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.dickersonsoftware.intuit;


/**
 *  DSoftQBWCSoapServiceMessageReceiverInOut message receiver
 */
public class DSoftQBWCSoapServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            DSoftQBWCSoapServiceSkeletonInterface skel = (DSoftQBWCSoapServiceSkeletonInterface) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                                                                      .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                    "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                            op.getName().getLocalPart())) != null)) {
                if ("sendRequestXML".equals(methodName)) {
                    com.dickersonsoftware.intuit.SendRequestXMLResponse sendRequestXMLResponse49 =
                        null;
                    com.dickersonsoftware.intuit.SendRequestXML wrappedParam = (com.dickersonsoftware.intuit.SendRequestXML) fromOM(msgContext.getEnvelope()
                                                                                                                                              .getBody()
                                                                                                                                              .getFirstElement(),
                            com.dickersonsoftware.intuit.SendRequestXML.class);

                    sendRequestXMLResponse49 = skel.sendRequestXML(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            sendRequestXMLResponse49, false,
                            new javax.xml.namespace.QName(
                                "http://intuit.dickersonsoftware.com/",
                                "sendRequestXMLResponse"));
                } else
                 if ("connectionError".equals(methodName)) {
                    com.dickersonsoftware.intuit.ConnectionErrorResponse connectionErrorResponse51 =
                        null;
                    com.dickersonsoftware.intuit.ConnectionError wrappedParam = (com.dickersonsoftware.intuit.ConnectionError) fromOM(msgContext.getEnvelope()
                                                                                                                                                .getBody()
                                                                                                                                                .getFirstElement(),
                            com.dickersonsoftware.intuit.ConnectionError.class);

                    connectionErrorResponse51 = skel.connectionError(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            connectionErrorResponse51, false,
                            new javax.xml.namespace.QName(
                                "http://intuit.dickersonsoftware.com/",
                                "connectionErrorResponse"));
                } else
                 if ("authenticate".equals(methodName)) {
                    com.dickersonsoftware.intuit.AuthenticateResponse authenticateResponse53 =
                        null;
                    com.dickersonsoftware.intuit.Authenticate wrappedParam = (com.dickersonsoftware.intuit.Authenticate) fromOM(msgContext.getEnvelope()
                                                                                                                                          .getBody()
                                                                                                                                          .getFirstElement(),
                            com.dickersonsoftware.intuit.Authenticate.class);

                    authenticateResponse53 = skel.authenticate(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            authenticateResponse53, false,
                            new javax.xml.namespace.QName(
                                "http://intuit.dickersonsoftware.com/",
                                "authenticateResponse"));
                } else
                 if ("receiveResponseXML".equals(methodName)) {
                    com.dickersonsoftware.intuit.ReceiveResponseXMLResponse receiveResponseXMLResponse55 =
                        null;
                    com.dickersonsoftware.intuit.ReceiveResponseXML wrappedParam =
                        (com.dickersonsoftware.intuit.ReceiveResponseXML) fromOM(msgContext.getEnvelope()
                                                                                           .getBody()
                                                                                           .getFirstElement(),
                            com.dickersonsoftware.intuit.ReceiveResponseXML.class);

                    receiveResponseXMLResponse55 = skel.receiveResponseXML(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            receiveResponseXMLResponse55, false,
                            new javax.xml.namespace.QName(
                                "http://intuit.dickersonsoftware.com/",
                                "receiveResponseXMLResponse"));
                } else
                 if ("serverVersion".equals(methodName)) {
                    com.dickersonsoftware.intuit.ServerVersionResponse serverVersionResponse57 =
                        null;
                    com.dickersonsoftware.intuit.ServerVersion wrappedParam = (com.dickersonsoftware.intuit.ServerVersion) fromOM(msgContext.getEnvelope()
                                                                                                                                            .getBody()
                                                                                                                                            .getFirstElement(),
                            com.dickersonsoftware.intuit.ServerVersion.class);

                    serverVersionResponse57 = skel.serverVersion(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            serverVersionResponse57, false,
                            new javax.xml.namespace.QName(
                                "http://intuit.dickersonsoftware.com/",
                                "serverVersionResponse"));
                } else
                 if ("getLastError".equals(methodName)) {
                    com.dickersonsoftware.intuit.GetLastErrorResponse getLastErrorResponse59 =
                        null;
                    com.dickersonsoftware.intuit.GetLastError wrappedParam = (com.dickersonsoftware.intuit.GetLastError) fromOM(msgContext.getEnvelope()
                                                                                                                                          .getBody()
                                                                                                                                          .getFirstElement(),
                            com.dickersonsoftware.intuit.GetLastError.class);

                    getLastErrorResponse59 = skel.getLastError(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getLastErrorResponse59, false,
                            new javax.xml.namespace.QName(
                                "http://intuit.dickersonsoftware.com/",
                                "getLastErrorResponse"));
                } else
                 if ("closeConnection".equals(methodName)) {
                    com.dickersonsoftware.intuit.CloseConnectionResponse closeConnectionResponse61 =
                        null;
                    com.dickersonsoftware.intuit.CloseConnection wrappedParam = (com.dickersonsoftware.intuit.CloseConnection) fromOM(msgContext.getEnvelope()
                                                                                                                                                .getBody()
                                                                                                                                                .getFirstElement(),
                            com.dickersonsoftware.intuit.CloseConnection.class);

                    closeConnectionResponse61 = skel.closeConnection(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            closeConnectionResponse61, false,
                            new javax.xml.namespace.QName(
                                "http://intuit.dickersonsoftware.com/",
                                "closeConnectionResponse"));
                } else
                 if ("clientVersion".equals(methodName)) {
                    com.dickersonsoftware.intuit.ClientVersionResponse clientVersionResponse63 =
                        null;
                    com.dickersonsoftware.intuit.ClientVersion wrappedParam = (com.dickersonsoftware.intuit.ClientVersion) fromOM(msgContext.getEnvelope()
                                                                                                                                            .getBody()
                                                                                                                                            .getFirstElement(),
                            com.dickersonsoftware.intuit.ClientVersion.class);

                    clientVersionResponse63 = skel.clientVersion(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            clientVersionResponse63, false,
                            new javax.xml.namespace.QName(
                                "http://intuit.dickersonsoftware.com/",
                                "clientVersionResponse"));
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement toOM(
        com.dickersonsoftware.intuit.SendRequestXML param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.dickersonsoftware.intuit.SendRequestXML.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.dickersonsoftware.intuit.SendRequestXMLResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.dickersonsoftware.intuit.SendRequestXMLResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.dickersonsoftware.intuit.ConnectionError param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.dickersonsoftware.intuit.ConnectionError.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.dickersonsoftware.intuit.ConnectionErrorResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.dickersonsoftware.intuit.ConnectionErrorResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.dickersonsoftware.intuit.Authenticate param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.dickersonsoftware.intuit.Authenticate.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.dickersonsoftware.intuit.AuthenticateResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.dickersonsoftware.intuit.AuthenticateResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.dickersonsoftware.intuit.ReceiveResponseXML param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.dickersonsoftware.intuit.ReceiveResponseXML.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.dickersonsoftware.intuit.ReceiveResponseXMLResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.dickersonsoftware.intuit.ReceiveResponseXMLResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.dickersonsoftware.intuit.ServerVersion param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.dickersonsoftware.intuit.ServerVersion.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.dickersonsoftware.intuit.ServerVersionResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.dickersonsoftware.intuit.ServerVersionResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.dickersonsoftware.intuit.GetLastError param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.dickersonsoftware.intuit.GetLastError.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.dickersonsoftware.intuit.GetLastErrorResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.dickersonsoftware.intuit.GetLastErrorResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.dickersonsoftware.intuit.CloseConnection param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.dickersonsoftware.intuit.CloseConnection.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.dickersonsoftware.intuit.CloseConnectionResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.dickersonsoftware.intuit.CloseConnectionResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.dickersonsoftware.intuit.ClientVersion param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.dickersonsoftware.intuit.ClientVersion.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.dickersonsoftware.intuit.ClientVersionResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.dickersonsoftware.intuit.ClientVersionResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.dickersonsoftware.intuit.SendRequestXMLResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    com.dickersonsoftware.intuit.SendRequestXMLResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.dickersonsoftware.intuit.SendRequestXMLResponse wrapsendRequestXML() {
        com.dickersonsoftware.intuit.SendRequestXMLResponse wrappedElement = new com.dickersonsoftware.intuit.SendRequestXMLResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.dickersonsoftware.intuit.ConnectionErrorResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    com.dickersonsoftware.intuit.ConnectionErrorResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.dickersonsoftware.intuit.ConnectionErrorResponse wrapconnectionError() {
        com.dickersonsoftware.intuit.ConnectionErrorResponse wrappedElement = new com.dickersonsoftware.intuit.ConnectionErrorResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.dickersonsoftware.intuit.AuthenticateResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    com.dickersonsoftware.intuit.AuthenticateResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.dickersonsoftware.intuit.AuthenticateResponse wrapauthenticate() {
        com.dickersonsoftware.intuit.AuthenticateResponse wrappedElement = new com.dickersonsoftware.intuit.AuthenticateResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.dickersonsoftware.intuit.ReceiveResponseXMLResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    com.dickersonsoftware.intuit.ReceiveResponseXMLResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.dickersonsoftware.intuit.ReceiveResponseXMLResponse wrapreceiveResponseXML() {
        com.dickersonsoftware.intuit.ReceiveResponseXMLResponse wrappedElement = new com.dickersonsoftware.intuit.ReceiveResponseXMLResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.dickersonsoftware.intuit.ServerVersionResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    com.dickersonsoftware.intuit.ServerVersionResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.dickersonsoftware.intuit.ServerVersionResponse wrapserverVersion() {
        com.dickersonsoftware.intuit.ServerVersionResponse wrappedElement = new com.dickersonsoftware.intuit.ServerVersionResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.dickersonsoftware.intuit.GetLastErrorResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    com.dickersonsoftware.intuit.GetLastErrorResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.dickersonsoftware.intuit.GetLastErrorResponse wrapgetLastError() {
        com.dickersonsoftware.intuit.GetLastErrorResponse wrappedElement = new com.dickersonsoftware.intuit.GetLastErrorResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.dickersonsoftware.intuit.CloseConnectionResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    com.dickersonsoftware.intuit.CloseConnectionResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.dickersonsoftware.intuit.CloseConnectionResponse wrapcloseConnection() {
        com.dickersonsoftware.intuit.CloseConnectionResponse wrappedElement = new com.dickersonsoftware.intuit.CloseConnectionResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.dickersonsoftware.intuit.ClientVersionResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    com.dickersonsoftware.intuit.ClientVersionResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.dickersonsoftware.intuit.ClientVersionResponse wrapclientVersion() {
        com.dickersonsoftware.intuit.ClientVersionResponse wrappedElement = new com.dickersonsoftware.intuit.ClientVersionResponse();

        return wrappedElement;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (com.dickersonsoftware.intuit.Authenticate.class.equals(type)) {
                return com.dickersonsoftware.intuit.Authenticate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.dickersonsoftware.intuit.AuthenticateResponse.class.equals(
                        type)) {
                return com.dickersonsoftware.intuit.AuthenticateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.dickersonsoftware.intuit.ClientVersion.class.equals(type)) {
                return com.dickersonsoftware.intuit.ClientVersion.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.dickersonsoftware.intuit.ClientVersionResponse.class.equals(
                        type)) {
                return com.dickersonsoftware.intuit.ClientVersionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.dickersonsoftware.intuit.CloseConnection.class.equals(type)) {
                return com.dickersonsoftware.intuit.CloseConnection.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.dickersonsoftware.intuit.CloseConnectionResponse.class.equals(
                        type)) {
                return com.dickersonsoftware.intuit.CloseConnectionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.dickersonsoftware.intuit.ConnectionError.class.equals(type)) {
                return com.dickersonsoftware.intuit.ConnectionError.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.dickersonsoftware.intuit.ConnectionErrorResponse.class.equals(
                        type)) {
                return com.dickersonsoftware.intuit.ConnectionErrorResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.dickersonsoftware.intuit.GetLastError.class.equals(type)) {
                return com.dickersonsoftware.intuit.GetLastError.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.dickersonsoftware.intuit.GetLastErrorResponse.class.equals(
                        type)) {
                return com.dickersonsoftware.intuit.GetLastErrorResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.dickersonsoftware.intuit.ReceiveResponseXML.class.equals(
                        type)) {
                return com.dickersonsoftware.intuit.ReceiveResponseXML.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.dickersonsoftware.intuit.ReceiveResponseXMLResponse.class.equals(
                        type)) {
                return com.dickersonsoftware.intuit.ReceiveResponseXMLResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.dickersonsoftware.intuit.SendRequestXML.class.equals(type)) {
                return com.dickersonsoftware.intuit.SendRequestXML.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.dickersonsoftware.intuit.SendRequestXMLResponse.class.equals(
                        type)) {
                return com.dickersonsoftware.intuit.SendRequestXMLResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.dickersonsoftware.intuit.ServerVersion.class.equals(type)) {
                return com.dickersonsoftware.intuit.ServerVersion.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.dickersonsoftware.intuit.ServerVersionResponse.class.equals(
                        type)) {
                return com.dickersonsoftware.intuit.ServerVersionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }
} //end of class
