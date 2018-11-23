/*
 * An XML document type.
 * Localname: authenticateResponse
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.AuthenticateResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer.impl;
/**
 * A document containing one authenticateResponse(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public class AuthenticateResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.AuthenticateResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AuthenticateResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHENTICATERESPONSE$0 = 
        new javax.xml.namespace.QName("http://developer.intuit.com/", "authenticateResponse");
    
    
    /**
     * Gets the "authenticateResponse" element
     */
    public com.intuit.developer.AuthenticateResponseDocument.AuthenticateResponse getAuthenticateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.AuthenticateResponseDocument.AuthenticateResponse target = null;
            target = (com.intuit.developer.AuthenticateResponseDocument.AuthenticateResponse)get_store().find_element_user(AUTHENTICATERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "authenticateResponse" element
     */
    public void setAuthenticateResponse(com.intuit.developer.AuthenticateResponseDocument.AuthenticateResponse authenticateResponse)
    {
        generatedSetterHelperImpl(authenticateResponse, AUTHENTICATERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "authenticateResponse" element
     */
    public com.intuit.developer.AuthenticateResponseDocument.AuthenticateResponse addNewAuthenticateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.AuthenticateResponseDocument.AuthenticateResponse target = null;
            target = (com.intuit.developer.AuthenticateResponseDocument.AuthenticateResponse)get_store().add_element_user(AUTHENTICATERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML authenticateResponse(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public static class AuthenticateResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.AuthenticateResponseDocument.AuthenticateResponse
    {
        private static final long serialVersionUID = 1L;
        
        public AuthenticateResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AUTHENTICATERESULT$0 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "authenticateResult");
        
        
        /**
         * Gets the "authenticateResult" element
         */
        public com.intuit.developer.ArrayOfString getAuthenticateResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.intuit.developer.ArrayOfString target = null;
                target = (com.intuit.developer.ArrayOfString)get_store().find_element_user(AUTHENTICATERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "authenticateResult" element
         */
        public boolean isSetAuthenticateResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AUTHENTICATERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "authenticateResult" element
         */
        public void setAuthenticateResult(com.intuit.developer.ArrayOfString authenticateResult)
        {
            generatedSetterHelperImpl(authenticateResult, AUTHENTICATERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "authenticateResult" element
         */
        public com.intuit.developer.ArrayOfString addNewAuthenticateResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.intuit.developer.ArrayOfString target = null;
                target = (com.intuit.developer.ArrayOfString)get_store().add_element_user(AUTHENTICATERESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "authenticateResult" element
         */
        public void unsetAuthenticateResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AUTHENTICATERESULT$0, 0);
            }
        }
    }
}
