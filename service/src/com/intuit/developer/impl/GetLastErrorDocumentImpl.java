/*
 * An XML document type.
 * Localname: getLastError
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.GetLastErrorDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer.impl;
/**
 * A document containing one getLastError(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public class GetLastErrorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.GetLastErrorDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetLastErrorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLASTERROR$0 = 
        new javax.xml.namespace.QName("http://developer.intuit.com/", "getLastError");
    
    
    /**
     * Gets the "getLastError" element
     */
    public com.intuit.developer.GetLastErrorDocument.GetLastError getGetLastError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.GetLastErrorDocument.GetLastError target = null;
            target = (com.intuit.developer.GetLastErrorDocument.GetLastError)get_store().find_element_user(GETLASTERROR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getLastError" element
     */
    public void setGetLastError(com.intuit.developer.GetLastErrorDocument.GetLastError getLastError)
    {
        generatedSetterHelperImpl(getLastError, GETLASTERROR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getLastError" element
     */
    public com.intuit.developer.GetLastErrorDocument.GetLastError addNewGetLastError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.GetLastErrorDocument.GetLastError target = null;
            target = (com.intuit.developer.GetLastErrorDocument.GetLastError)get_store().add_element_user(GETLASTERROR$0);
            return target;
        }
    }
    /**
     * An XML getLastError(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public static class GetLastErrorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.GetLastErrorDocument.GetLastError
    {
        private static final long serialVersionUID = 1L;
        
        public GetLastErrorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TICKET$0 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "ticket");
        
        
        /**
         * Gets the "ticket" element
         */
        public java.lang.String getTicket()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TICKET$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ticket" element
         */
        public org.apache.xmlbeans.XmlString xgetTicket()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TICKET$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "ticket" element
         */
        public boolean isSetTicket()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TICKET$0) != 0;
            }
        }
        
        /**
         * Sets the "ticket" element
         */
        public void setTicket(java.lang.String ticket)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TICKET$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TICKET$0);
                }
                target.setStringValue(ticket);
            }
        }
        
        /**
         * Sets (as xml) the "ticket" element
         */
        public void xsetTicket(org.apache.xmlbeans.XmlString ticket)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TICKET$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TICKET$0);
                }
                target.set(ticket);
            }
        }
        
        /**
         * Unsets the "ticket" element
         */
        public void unsetTicket()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TICKET$0, 0);
            }
        }
    }
}
