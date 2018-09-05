/*
 * An XML document type.
 * Localname: closeConnectionResponse
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.CloseConnectionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer.impl;
/**
 * A document containing one closeConnectionResponse(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public class CloseConnectionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.CloseConnectionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CloseConnectionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSECONNECTIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://developer.intuit.com/", "closeConnectionResponse");
    
    
    /**
     * Gets the "closeConnectionResponse" element
     */
    public com.intuit.developer.CloseConnectionResponseDocument.CloseConnectionResponse getCloseConnectionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.CloseConnectionResponseDocument.CloseConnectionResponse target = null;
            target = (com.intuit.developer.CloseConnectionResponseDocument.CloseConnectionResponse)get_store().find_element_user(CLOSECONNECTIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "closeConnectionResponse" element
     */
    public void setCloseConnectionResponse(com.intuit.developer.CloseConnectionResponseDocument.CloseConnectionResponse closeConnectionResponse)
    {
        generatedSetterHelperImpl(closeConnectionResponse, CLOSECONNECTIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "closeConnectionResponse" element
     */
    public com.intuit.developer.CloseConnectionResponseDocument.CloseConnectionResponse addNewCloseConnectionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.CloseConnectionResponseDocument.CloseConnectionResponse target = null;
            target = (com.intuit.developer.CloseConnectionResponseDocument.CloseConnectionResponse)get_store().add_element_user(CLOSECONNECTIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML closeConnectionResponse(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public static class CloseConnectionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.CloseConnectionResponseDocument.CloseConnectionResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CloseConnectionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLOSECONNECTIONRESULT$0 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "closeConnectionResult");
        
        
        /**
         * Gets the "closeConnectionResult" element
         */
        public java.lang.String getCloseConnectionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSECONNECTIONRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "closeConnectionResult" element
         */
        public org.apache.xmlbeans.XmlString xgetCloseConnectionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSECONNECTIONRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "closeConnectionResult" element
         */
        public boolean isSetCloseConnectionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLOSECONNECTIONRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "closeConnectionResult" element
         */
        public void setCloseConnectionResult(java.lang.String closeConnectionResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSECONNECTIONRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSECONNECTIONRESULT$0);
                }
                target.setStringValue(closeConnectionResult);
            }
        }
        
        /**
         * Sets (as xml) the "closeConnectionResult" element
         */
        public void xsetCloseConnectionResult(org.apache.xmlbeans.XmlString closeConnectionResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSECONNECTIONRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLOSECONNECTIONRESULT$0);
                }
                target.set(closeConnectionResult);
            }
        }
        
        /**
         * Unsets the "closeConnectionResult" element
         */
        public void unsetCloseConnectionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLOSECONNECTIONRESULT$0, 0);
            }
        }
    }
}
