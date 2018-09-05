/*
 * An XML document type.
 * Localname: sendRequestXMLResponse
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.SendRequestXMLResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer.impl;
/**
 * A document containing one sendRequestXMLResponse(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public class SendRequestXMLResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.SendRequestXMLResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SendRequestXMLResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDREQUESTXMLRESPONSE$0 = 
        new javax.xml.namespace.QName("http://developer.intuit.com/", "sendRequestXMLResponse");
    
    
    /**
     * Gets the "sendRequestXMLResponse" element
     */
    public com.intuit.developer.SendRequestXMLResponseDocument.SendRequestXMLResponse getSendRequestXMLResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.SendRequestXMLResponseDocument.SendRequestXMLResponse target = null;
            target = (com.intuit.developer.SendRequestXMLResponseDocument.SendRequestXMLResponse)get_store().find_element_user(SENDREQUESTXMLRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sendRequestXMLResponse" element
     */
    public void setSendRequestXMLResponse(com.intuit.developer.SendRequestXMLResponseDocument.SendRequestXMLResponse sendRequestXMLResponse)
    {
        generatedSetterHelperImpl(sendRequestXMLResponse, SENDREQUESTXMLRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sendRequestXMLResponse" element
     */
    public com.intuit.developer.SendRequestXMLResponseDocument.SendRequestXMLResponse addNewSendRequestXMLResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.SendRequestXMLResponseDocument.SendRequestXMLResponse target = null;
            target = (com.intuit.developer.SendRequestXMLResponseDocument.SendRequestXMLResponse)get_store().add_element_user(SENDREQUESTXMLRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML sendRequestXMLResponse(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public static class SendRequestXMLResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.SendRequestXMLResponseDocument.SendRequestXMLResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SendRequestXMLResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SENDREQUESTXMLRESULT$0 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "sendRequestXMLResult");
        
        
        /**
         * Gets the "sendRequestXMLResult" element
         */
        public java.lang.String getSendRequestXMLResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDREQUESTXMLRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sendRequestXMLResult" element
         */
        public org.apache.xmlbeans.XmlString xgetSendRequestXMLResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDREQUESTXMLRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "sendRequestXMLResult" element
         */
        public boolean isSetSendRequestXMLResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SENDREQUESTXMLRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "sendRequestXMLResult" element
         */
        public void setSendRequestXMLResult(java.lang.String sendRequestXMLResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDREQUESTXMLRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDREQUESTXMLRESULT$0);
                }
                target.setStringValue(sendRequestXMLResult);
            }
        }
        
        /**
         * Sets (as xml) the "sendRequestXMLResult" element
         */
        public void xsetSendRequestXMLResult(org.apache.xmlbeans.XmlString sendRequestXMLResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDREQUESTXMLRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENDREQUESTXMLRESULT$0);
                }
                target.set(sendRequestXMLResult);
            }
        }
        
        /**
         * Unsets the "sendRequestXMLResult" element
         */
        public void unsetSendRequestXMLResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SENDREQUESTXMLRESULT$0, 0);
            }
        }
    }
}
