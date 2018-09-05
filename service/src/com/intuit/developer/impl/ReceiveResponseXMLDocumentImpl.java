/*
 * An XML document type.
 * Localname: receiveResponseXML
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.ReceiveResponseXMLDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer.impl;
/**
 * A document containing one receiveResponseXML(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public class ReceiveResponseXMLDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.ReceiveResponseXMLDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReceiveResponseXMLDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECEIVERESPONSEXML$0 = 
        new javax.xml.namespace.QName("http://developer.intuit.com/", "receiveResponseXML");
    
    
    /**
     * Gets the "receiveResponseXML" element
     */
    public com.intuit.developer.ReceiveResponseXMLDocument.ReceiveResponseXML getReceiveResponseXML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.ReceiveResponseXMLDocument.ReceiveResponseXML target = null;
            target = (com.intuit.developer.ReceiveResponseXMLDocument.ReceiveResponseXML)get_store().find_element_user(RECEIVERESPONSEXML$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "receiveResponseXML" element
     */
    public void setReceiveResponseXML(com.intuit.developer.ReceiveResponseXMLDocument.ReceiveResponseXML receiveResponseXML)
    {
        generatedSetterHelperImpl(receiveResponseXML, RECEIVERESPONSEXML$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "receiveResponseXML" element
     */
    public com.intuit.developer.ReceiveResponseXMLDocument.ReceiveResponseXML addNewReceiveResponseXML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.ReceiveResponseXMLDocument.ReceiveResponseXML target = null;
            target = (com.intuit.developer.ReceiveResponseXMLDocument.ReceiveResponseXML)get_store().add_element_user(RECEIVERESPONSEXML$0);
            return target;
        }
    }
    /**
     * An XML receiveResponseXML(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public static class ReceiveResponseXMLImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.ReceiveResponseXMLDocument.ReceiveResponseXML
    {
        private static final long serialVersionUID = 1L;
        
        public ReceiveResponseXMLImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TICKET$0 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "ticket");
        private static final javax.xml.namespace.QName RESPONSE$2 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "response");
        private static final javax.xml.namespace.QName HRESULT$4 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "hresult");
        private static final javax.xml.namespace.QName MESSAGE$6 = 
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
         * Gets the "response" element
         */
        public java.lang.String getResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "response" element
         */
        public org.apache.xmlbeans.XmlString xgetResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "response" element
         */
        public boolean isSetResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESPONSE$2) != 0;
            }
        }
        
        /**
         * Sets the "response" element
         */
        public void setResponse(java.lang.String response)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSE$2);
                }
                target.setStringValue(response);
            }
        }
        
        /**
         * Sets (as xml) the "response" element
         */
        public void xsetResponse(org.apache.xmlbeans.XmlString response)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSE$2);
                }
                target.set(response);
            }
        }
        
        /**
         * Unsets the "response" element
         */
        public void unsetResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESPONSE$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HRESULT$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HRESULT$4, 0);
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
                return get_store().count_elements(HRESULT$4) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HRESULT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HRESULT$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HRESULT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HRESULT$4);
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
                get_store().remove_element(HRESULT$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$6, 0);
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
                return get_store().count_elements(MESSAGE$6) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$6);
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
                get_store().remove_element(MESSAGE$6, 0);
            }
        }
    }
}
