/*
 * An XML document type.
 * Localname: clientVersionResponse
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.ClientVersionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer.impl;
/**
 * A document containing one clientVersionResponse(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public class ClientVersionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.ClientVersionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClientVersionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTVERSIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://developer.intuit.com/", "clientVersionResponse");
    
    
    /**
     * Gets the "clientVersionResponse" element
     */
    public com.intuit.developer.ClientVersionResponseDocument.ClientVersionResponse getClientVersionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.ClientVersionResponseDocument.ClientVersionResponse target = null;
            target = (com.intuit.developer.ClientVersionResponseDocument.ClientVersionResponse)get_store().find_element_user(CLIENTVERSIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clientVersionResponse" element
     */
    public void setClientVersionResponse(com.intuit.developer.ClientVersionResponseDocument.ClientVersionResponse clientVersionResponse)
    {
        generatedSetterHelperImpl(clientVersionResponse, CLIENTVERSIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "clientVersionResponse" element
     */
    public com.intuit.developer.ClientVersionResponseDocument.ClientVersionResponse addNewClientVersionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.ClientVersionResponseDocument.ClientVersionResponse target = null;
            target = (com.intuit.developer.ClientVersionResponseDocument.ClientVersionResponse)get_store().add_element_user(CLIENTVERSIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML clientVersionResponse(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public static class ClientVersionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.ClientVersionResponseDocument.ClientVersionResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ClientVersionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLIENTVERSIONRESULT$0 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "clientVersionResult");
        
        
        /**
         * Gets the "clientVersionResult" element
         */
        public java.lang.String getClientVersionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTVERSIONRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "clientVersionResult" element
         */
        public org.apache.xmlbeans.XmlString xgetClientVersionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTVERSIONRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "clientVersionResult" element
         */
        public boolean isSetClientVersionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLIENTVERSIONRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "clientVersionResult" element
         */
        public void setClientVersionResult(java.lang.String clientVersionResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTVERSIONRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIENTVERSIONRESULT$0);
                }
                target.setStringValue(clientVersionResult);
            }
        }
        
        /**
         * Sets (as xml) the "clientVersionResult" element
         */
        public void xsetClientVersionResult(org.apache.xmlbeans.XmlString clientVersionResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTVERSIONRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLIENTVERSIONRESULT$0);
                }
                target.set(clientVersionResult);
            }
        }
        
        /**
         * Unsets the "clientVersionResult" element
         */
        public void unsetClientVersionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLIENTVERSIONRESULT$0, 0);
            }
        }
    }
}
