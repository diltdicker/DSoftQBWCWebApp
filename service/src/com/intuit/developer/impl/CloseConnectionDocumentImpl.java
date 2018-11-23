/*
 * An XML document type.
 * Localname: closeConnection
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.CloseConnectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer.impl;
/**
 * A document containing one closeConnection(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public class CloseConnectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.CloseConnectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public CloseConnectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSECONNECTION$0 = 
        new javax.xml.namespace.QName("http://developer.intuit.com/", "closeConnection");
    
    
    /**
     * Gets the "closeConnection" element
     */
    public com.intuit.developer.CloseConnectionDocument.CloseConnection getCloseConnection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.CloseConnectionDocument.CloseConnection target = null;
            target = (com.intuit.developer.CloseConnectionDocument.CloseConnection)get_store().find_element_user(CLOSECONNECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "closeConnection" element
     */
    public void setCloseConnection(com.intuit.developer.CloseConnectionDocument.CloseConnection closeConnection)
    {
        generatedSetterHelperImpl(closeConnection, CLOSECONNECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "closeConnection" element
     */
    public com.intuit.developer.CloseConnectionDocument.CloseConnection addNewCloseConnection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.CloseConnectionDocument.CloseConnection target = null;
            target = (com.intuit.developer.CloseConnectionDocument.CloseConnection)get_store().add_element_user(CLOSECONNECTION$0);
            return target;
        }
    }
    /**
     * An XML closeConnection(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public static class CloseConnectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.CloseConnectionDocument.CloseConnection
    {
        private static final long serialVersionUID = 1L;
        
        public CloseConnectionImpl(org.apache.xmlbeans.SchemaType sType)
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
