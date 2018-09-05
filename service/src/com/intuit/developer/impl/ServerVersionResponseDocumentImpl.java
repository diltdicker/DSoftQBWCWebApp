/*
 * An XML document type.
 * Localname: serverVersionResponse
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.ServerVersionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer.impl;
/**
 * A document containing one serverVersionResponse(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public class ServerVersionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.ServerVersionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServerVersionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVERVERSIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://developer.intuit.com/", "serverVersionResponse");
    
    
    /**
     * Gets the "serverVersionResponse" element
     */
    public com.intuit.developer.ServerVersionResponseDocument.ServerVersionResponse getServerVersionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.ServerVersionResponseDocument.ServerVersionResponse target = null;
            target = (com.intuit.developer.ServerVersionResponseDocument.ServerVersionResponse)get_store().find_element_user(SERVERVERSIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "serverVersionResponse" element
     */
    public void setServerVersionResponse(com.intuit.developer.ServerVersionResponseDocument.ServerVersionResponse serverVersionResponse)
    {
        generatedSetterHelperImpl(serverVersionResponse, SERVERVERSIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "serverVersionResponse" element
     */
    public com.intuit.developer.ServerVersionResponseDocument.ServerVersionResponse addNewServerVersionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.ServerVersionResponseDocument.ServerVersionResponse target = null;
            target = (com.intuit.developer.ServerVersionResponseDocument.ServerVersionResponse)get_store().add_element_user(SERVERVERSIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML serverVersionResponse(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public static class ServerVersionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.ServerVersionResponseDocument.ServerVersionResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ServerVersionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SERVERVERSIONRESULT$0 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "serverVersionResult");
        
        
        /**
         * Gets the "serverVersionResult" element
         */
        public java.lang.String getServerVersionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVERVERSIONRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "serverVersionResult" element
         */
        public org.apache.xmlbeans.XmlString xgetServerVersionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVERVERSIONRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "serverVersionResult" element
         */
        public boolean isSetServerVersionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVERVERSIONRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "serverVersionResult" element
         */
        public void setServerVersionResult(java.lang.String serverVersionResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVERVERSIONRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVERVERSIONRESULT$0);
                }
                target.setStringValue(serverVersionResult);
            }
        }
        
        /**
         * Sets (as xml) the "serverVersionResult" element
         */
        public void xsetServerVersionResult(org.apache.xmlbeans.XmlString serverVersionResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVERVERSIONRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVERVERSIONRESULT$0);
                }
                target.set(serverVersionResult);
            }
        }
        
        /**
         * Unsets the "serverVersionResult" element
         */
        public void unsetServerVersionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVERVERSIONRESULT$0, 0);
            }
        }
    }
}
