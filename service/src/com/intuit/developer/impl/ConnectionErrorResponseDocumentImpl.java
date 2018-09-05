/*
 * An XML document type.
 * Localname: connectionErrorResponse
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.ConnectionErrorResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer.impl;
/**
 * A document containing one connectionErrorResponse(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public class ConnectionErrorResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.ConnectionErrorResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConnectionErrorResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTIONERRORRESPONSE$0 = 
        new javax.xml.namespace.QName("http://developer.intuit.com/", "connectionErrorResponse");
    
    
    /**
     * Gets the "connectionErrorResponse" element
     */
    public com.intuit.developer.ConnectionErrorResponseDocument.ConnectionErrorResponse getConnectionErrorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.ConnectionErrorResponseDocument.ConnectionErrorResponse target = null;
            target = (com.intuit.developer.ConnectionErrorResponseDocument.ConnectionErrorResponse)get_store().find_element_user(CONNECTIONERRORRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "connectionErrorResponse" element
     */
    public void setConnectionErrorResponse(com.intuit.developer.ConnectionErrorResponseDocument.ConnectionErrorResponse connectionErrorResponse)
    {
        generatedSetterHelperImpl(connectionErrorResponse, CONNECTIONERRORRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "connectionErrorResponse" element
     */
    public com.intuit.developer.ConnectionErrorResponseDocument.ConnectionErrorResponse addNewConnectionErrorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.ConnectionErrorResponseDocument.ConnectionErrorResponse target = null;
            target = (com.intuit.developer.ConnectionErrorResponseDocument.ConnectionErrorResponse)get_store().add_element_user(CONNECTIONERRORRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML connectionErrorResponse(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public static class ConnectionErrorResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.ConnectionErrorResponseDocument.ConnectionErrorResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ConnectionErrorResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONNECTIONERRORRESULT$0 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "connectionErrorResult");
        
        
        /**
         * Gets the "connectionErrorResult" element
         */
        public java.lang.String getConnectionErrorResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONNECTIONERRORRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "connectionErrorResult" element
         */
        public org.apache.xmlbeans.XmlString xgetConnectionErrorResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONNECTIONERRORRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "connectionErrorResult" element
         */
        public boolean isSetConnectionErrorResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONNECTIONERRORRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "connectionErrorResult" element
         */
        public void setConnectionErrorResult(java.lang.String connectionErrorResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONNECTIONERRORRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONNECTIONERRORRESULT$0);
                }
                target.setStringValue(connectionErrorResult);
            }
        }
        
        /**
         * Sets (as xml) the "connectionErrorResult" element
         */
        public void xsetConnectionErrorResult(org.apache.xmlbeans.XmlString connectionErrorResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONNECTIONERRORRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONNECTIONERRORRESULT$0);
                }
                target.set(connectionErrorResult);
            }
        }
        
        /**
         * Unsets the "connectionErrorResult" element
         */
        public void unsetConnectionErrorResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONNECTIONERRORRESULT$0, 0);
            }
        }
    }
}
