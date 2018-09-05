/*
 * An XML document type.
 * Localname: authenticate
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.AuthenticateDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer.impl;
/**
 * A document containing one authenticate(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public class AuthenticateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.AuthenticateDocument
{
    private static final long serialVersionUID = 1L;
    
    public AuthenticateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHENTICATE$0 = 
        new javax.xml.namespace.QName("http://developer.intuit.com/", "authenticate");
    
    
    /**
     * Gets the "authenticate" element
     */
    public com.intuit.developer.AuthenticateDocument.Authenticate getAuthenticate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.AuthenticateDocument.Authenticate target = null;
            target = (com.intuit.developer.AuthenticateDocument.Authenticate)get_store().find_element_user(AUTHENTICATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "authenticate" element
     */
    public void setAuthenticate(com.intuit.developer.AuthenticateDocument.Authenticate authenticate)
    {
        generatedSetterHelperImpl(authenticate, AUTHENTICATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "authenticate" element
     */
    public com.intuit.developer.AuthenticateDocument.Authenticate addNewAuthenticate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.AuthenticateDocument.Authenticate target = null;
            target = (com.intuit.developer.AuthenticateDocument.Authenticate)get_store().add_element_user(AUTHENTICATE$0);
            return target;
        }
    }
    /**
     * An XML authenticate(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public static class AuthenticateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.AuthenticateDocument.Authenticate
    {
        private static final long serialVersionUID = 1L;
        
        public AuthenticateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STRUSERNAME$0 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "strUserName");
        private static final javax.xml.namespace.QName STRPASSWORD$2 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "strPassword");
        
        
        /**
         * Gets the "strUserName" element
         */
        public java.lang.String getStrUserName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRUSERNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "strUserName" element
         */
        public org.apache.xmlbeans.XmlString xgetStrUserName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRUSERNAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "strUserName" element
         */
        public boolean isSetStrUserName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRUSERNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "strUserName" element
         */
        public void setStrUserName(java.lang.String strUserName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRUSERNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRUSERNAME$0);
                }
                target.setStringValue(strUserName);
            }
        }
        
        /**
         * Sets (as xml) the "strUserName" element
         */
        public void xsetStrUserName(org.apache.xmlbeans.XmlString strUserName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRUSERNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRUSERNAME$0);
                }
                target.set(strUserName);
            }
        }
        
        /**
         * Unsets the "strUserName" element
         */
        public void unsetStrUserName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRUSERNAME$0, 0);
            }
        }
        
        /**
         * Gets the "strPassword" element
         */
        public java.lang.String getStrPassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRPASSWORD$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "strPassword" element
         */
        public org.apache.xmlbeans.XmlString xgetStrPassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRPASSWORD$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "strPassword" element
         */
        public boolean isSetStrPassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRPASSWORD$2) != 0;
            }
        }
        
        /**
         * Sets the "strPassword" element
         */
        public void setStrPassword(java.lang.String strPassword)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRPASSWORD$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRPASSWORD$2);
                }
                target.setStringValue(strPassword);
            }
        }
        
        /**
         * Sets (as xml) the "strPassword" element
         */
        public void xsetStrPassword(org.apache.xmlbeans.XmlString strPassword)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRPASSWORD$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRPASSWORD$2);
                }
                target.set(strPassword);
            }
        }
        
        /**
         * Unsets the "strPassword" element
         */
        public void unsetStrPassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRPASSWORD$2, 0);
            }
        }
    }
}
