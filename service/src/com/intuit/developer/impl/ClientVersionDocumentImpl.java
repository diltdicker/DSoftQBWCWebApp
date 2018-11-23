/*
 * An XML document type.
 * Localname: clientVersion
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.ClientVersionDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer.impl;
/**
 * A document containing one clientVersion(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public class ClientVersionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.ClientVersionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClientVersionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTVERSION$0 = 
        new javax.xml.namespace.QName("http://developer.intuit.com/", "clientVersion");
    
    
    /**
     * Gets the "clientVersion" element
     */
    public com.intuit.developer.ClientVersionDocument.ClientVersion getClientVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.ClientVersionDocument.ClientVersion target = null;
            target = (com.intuit.developer.ClientVersionDocument.ClientVersion)get_store().find_element_user(CLIENTVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clientVersion" element
     */
    public void setClientVersion(com.intuit.developer.ClientVersionDocument.ClientVersion clientVersion)
    {
        generatedSetterHelperImpl(clientVersion, CLIENTVERSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "clientVersion" element
     */
    public com.intuit.developer.ClientVersionDocument.ClientVersion addNewClientVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.ClientVersionDocument.ClientVersion target = null;
            target = (com.intuit.developer.ClientVersionDocument.ClientVersion)get_store().add_element_user(CLIENTVERSION$0);
            return target;
        }
    }
    /**
     * An XML clientVersion(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public static class ClientVersionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.ClientVersionDocument.ClientVersion
    {
        private static final long serialVersionUID = 1L;
        
        public ClientVersionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STRVERSION$0 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "strVersion");
        
        
        /**
         * Gets the "strVersion" element
         */
        public java.lang.String getStrVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRVERSION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "strVersion" element
         */
        public org.apache.xmlbeans.XmlString xgetStrVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRVERSION$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "strVersion" element
         */
        public boolean isSetStrVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRVERSION$0) != 0;
            }
        }
        
        /**
         * Sets the "strVersion" element
         */
        public void setStrVersion(java.lang.String strVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRVERSION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRVERSION$0);
                }
                target.setStringValue(strVersion);
            }
        }
        
        /**
         * Sets (as xml) the "strVersion" element
         */
        public void xsetStrVersion(org.apache.xmlbeans.XmlString strVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRVERSION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRVERSION$0);
                }
                target.set(strVersion);
            }
        }
        
        /**
         * Unsets the "strVersion" element
         */
        public void unsetStrVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRVERSION$0, 0);
            }
        }
    }
}
