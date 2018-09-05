/*
 * An XML document type.
 * Localname: getLastErrorResponse
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.GetLastErrorResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer.impl;
/**
 * A document containing one getLastErrorResponse(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public class GetLastErrorResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.GetLastErrorResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetLastErrorResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLASTERRORRESPONSE$0 = 
        new javax.xml.namespace.QName("http://developer.intuit.com/", "getLastErrorResponse");
    
    
    /**
     * Gets the "getLastErrorResponse" element
     */
    public com.intuit.developer.GetLastErrorResponseDocument.GetLastErrorResponse getGetLastErrorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.GetLastErrorResponseDocument.GetLastErrorResponse target = null;
            target = (com.intuit.developer.GetLastErrorResponseDocument.GetLastErrorResponse)get_store().find_element_user(GETLASTERRORRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getLastErrorResponse" element
     */
    public void setGetLastErrorResponse(com.intuit.developer.GetLastErrorResponseDocument.GetLastErrorResponse getLastErrorResponse)
    {
        generatedSetterHelperImpl(getLastErrorResponse, GETLASTERRORRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getLastErrorResponse" element
     */
    public com.intuit.developer.GetLastErrorResponseDocument.GetLastErrorResponse addNewGetLastErrorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.GetLastErrorResponseDocument.GetLastErrorResponse target = null;
            target = (com.intuit.developer.GetLastErrorResponseDocument.GetLastErrorResponse)get_store().add_element_user(GETLASTERRORRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getLastErrorResponse(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public static class GetLastErrorResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.GetLastErrorResponseDocument.GetLastErrorResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetLastErrorResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETLASTERRORRESULT$0 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "getLastErrorResult");
        
        
        /**
         * Gets the "getLastErrorResult" element
         */
        public java.lang.String getGetLastErrorResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETLASTERRORRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "getLastErrorResult" element
         */
        public org.apache.xmlbeans.XmlString xgetGetLastErrorResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GETLASTERRORRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "getLastErrorResult" element
         */
        public boolean isSetGetLastErrorResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETLASTERRORRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "getLastErrorResult" element
         */
        public void setGetLastErrorResult(java.lang.String getLastErrorResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETLASTERRORRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GETLASTERRORRESULT$0);
                }
                target.setStringValue(getLastErrorResult);
            }
        }
        
        /**
         * Sets (as xml) the "getLastErrorResult" element
         */
        public void xsetGetLastErrorResult(org.apache.xmlbeans.XmlString getLastErrorResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GETLASTERRORRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GETLASTERRORRESULT$0);
                }
                target.set(getLastErrorResult);
            }
        }
        
        /**
         * Unsets the "getLastErrorResult" element
         */
        public void unsetGetLastErrorResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETLASTERRORRESULT$0, 0);
            }
        }
    }
}
