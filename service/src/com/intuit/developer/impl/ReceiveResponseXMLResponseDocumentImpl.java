/*
 * An XML document type.
 * Localname: receiveResponseXMLResponse
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.ReceiveResponseXMLResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer.impl;
/**
 * A document containing one receiveResponseXMLResponse(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public class ReceiveResponseXMLResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.ReceiveResponseXMLResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReceiveResponseXMLResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECEIVERESPONSEXMLRESPONSE$0 = 
        new javax.xml.namespace.QName("http://developer.intuit.com/", "receiveResponseXMLResponse");
    
    
    /**
     * Gets the "receiveResponseXMLResponse" element
     */
    public com.intuit.developer.ReceiveResponseXMLResponseDocument.ReceiveResponseXMLResponse getReceiveResponseXMLResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.ReceiveResponseXMLResponseDocument.ReceiveResponseXMLResponse target = null;
            target = (com.intuit.developer.ReceiveResponseXMLResponseDocument.ReceiveResponseXMLResponse)get_store().find_element_user(RECEIVERESPONSEXMLRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "receiveResponseXMLResponse" element
     */
    public void setReceiveResponseXMLResponse(com.intuit.developer.ReceiveResponseXMLResponseDocument.ReceiveResponseXMLResponse receiveResponseXMLResponse)
    {
        generatedSetterHelperImpl(receiveResponseXMLResponse, RECEIVERESPONSEXMLRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "receiveResponseXMLResponse" element
     */
    public com.intuit.developer.ReceiveResponseXMLResponseDocument.ReceiveResponseXMLResponse addNewReceiveResponseXMLResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.ReceiveResponseXMLResponseDocument.ReceiveResponseXMLResponse target = null;
            target = (com.intuit.developer.ReceiveResponseXMLResponseDocument.ReceiveResponseXMLResponse)get_store().add_element_user(RECEIVERESPONSEXMLRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML receiveResponseXMLResponse(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public static class ReceiveResponseXMLResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.ReceiveResponseXMLResponseDocument.ReceiveResponseXMLResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ReceiveResponseXMLResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RECEIVERESPONSEXMLRESULT$0 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "receiveResponseXMLResult");
        
        
        /**
         * Gets the "receiveResponseXMLResult" element
         */
        public int getReceiveResponseXMLResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVERESPONSEXMLRESULT$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "receiveResponseXMLResult" element
         */
        public org.apache.xmlbeans.XmlInt xgetReceiveResponseXMLResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECEIVERESPONSEXMLRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "receiveResponseXMLResult" element
         */
        public void setReceiveResponseXMLResult(int receiveResponseXMLResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVERESPONSEXMLRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECEIVERESPONSEXMLRESULT$0);
                }
                target.setIntValue(receiveResponseXMLResult);
            }
        }
        
        /**
         * Sets (as xml) the "receiveResponseXMLResult" element
         */
        public void xsetReceiveResponseXMLResult(org.apache.xmlbeans.XmlInt receiveResponseXMLResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECEIVERESPONSEXMLRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RECEIVERESPONSEXMLRESULT$0);
                }
                target.set(receiveResponseXMLResult);
            }
        }
    }
}
