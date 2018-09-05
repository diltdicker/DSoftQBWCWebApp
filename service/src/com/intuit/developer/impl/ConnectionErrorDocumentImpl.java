/*
 * An XML document type.
 * Localname: connectionError
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.ConnectionErrorDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer.impl;
/**
 * A document containing one connectionError(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public class ConnectionErrorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.ConnectionErrorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConnectionErrorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTIONERROR$0 = 
        new javax.xml.namespace.QName("http://developer.intuit.com/", "connectionError");
    
    
    /**
     * Gets the "connectionError" element
     */
    public com.intuit.developer.ConnectionErrorDocument.ConnectionError getConnectionError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.ConnectionErrorDocument.ConnectionError target = null;
            target = (com.intuit.developer.ConnectionErrorDocument.ConnectionError)get_store().find_element_user(CONNECTIONERROR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "connectionError" element
     */
    public void setConnectionError(com.intuit.developer.ConnectionErrorDocument.ConnectionError connectionError)
    {
        generatedSetterHelperImpl(connectionError, CONNECTIONERROR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "connectionError" element
     */
    public com.intuit.developer.ConnectionErrorDocument.ConnectionError addNewConnectionError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.ConnectionErrorDocument.ConnectionError target = null;
            target = (com.intuit.developer.ConnectionErrorDocument.ConnectionError)get_store().add_element_user(CONNECTIONERROR$0);
            return target;
        }
    }
    /**
     * An XML connectionError(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public static class ConnectionErrorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.ConnectionErrorDocument.ConnectionError
    {
        private static final long serialVersionUID = 1L;
        
        public ConnectionErrorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TICKET$0 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "ticket");
        private static final javax.xml.namespace.QName HRESULT$2 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "hresult");
        private static final javax.xml.namespace.QName MESSAGE$4 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "message");
        
        
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
        
        /**
         * Gets the "hresult" element
         */
        public java.lang.String getHresult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HRESULT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "hresult" element
         */
        public org.apache.xmlbeans.XmlString xgetHresult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HRESULT$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "hresult" element
         */
        public boolean isSetHresult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HRESULT$2) != 0;
            }
        }
        
        /**
         * Sets the "hresult" element
         */
        public void setHresult(java.lang.String hresult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HRESULT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HRESULT$2);
                }
                target.setStringValue(hresult);
            }
        }
        
        /**
         * Sets (as xml) the "hresult" element
         */
        public void xsetHresult(org.apache.xmlbeans.XmlString hresult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HRESULT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HRESULT$2);
                }
                target.set(hresult);
            }
        }
        
        /**
         * Unsets the "hresult" element
         */
        public void unsetHresult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HRESULT$2, 0);
            }
        }
        
        /**
         * Gets the "message" element
         */
        public java.lang.String getMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "message" element
         */
        public org.apache.xmlbeans.XmlString xgetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "message" element
         */
        public boolean isSetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MESSAGE$4) != 0;
            }
        }
        
        /**
         * Sets the "message" element
         */
        public void setMessage(java.lang.String message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$4);
                }
                target.setStringValue(message);
            }
        }
        
        /**
         * Sets (as xml) the "message" element
         */
        public void xsetMessage(org.apache.xmlbeans.XmlString message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$4);
                }
                target.set(message);
            }
        }
        
        /**
         * Unsets the "message" element
         */
        public void unsetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MESSAGE$4, 0);
            }
        }
    }
}
