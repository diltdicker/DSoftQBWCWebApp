/*
 * An XML document type.
 * Localname: serverVersion
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.ServerVersionDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer.impl;
/**
 * A document containing one serverVersion(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public class ServerVersionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.ServerVersionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServerVersionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVERVERSION$0 = 
        new javax.xml.namespace.QName("http://developer.intuit.com/", "serverVersion");
    
    
    /**
     * Gets the "serverVersion" element
     */
    public com.intuit.developer.ServerVersionDocument.ServerVersion getServerVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.ServerVersionDocument.ServerVersion target = null;
            target = (com.intuit.developer.ServerVersionDocument.ServerVersion)get_store().find_element_user(SERVERVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "serverVersion" element
     */
    public void setServerVersion(com.intuit.developer.ServerVersionDocument.ServerVersion serverVersion)
    {
        generatedSetterHelperImpl(serverVersion, SERVERVERSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "serverVersion" element
     */
    public com.intuit.developer.ServerVersionDocument.ServerVersion addNewServerVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.ServerVersionDocument.ServerVersion target = null;
            target = (com.intuit.developer.ServerVersionDocument.ServerVersion)get_store().add_element_user(SERVERVERSION$0);
            return target;
        }
    }
    /**
     * An XML serverVersion(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public static class ServerVersionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.ServerVersionDocument.ServerVersion
    {
        private static final long serialVersionUID = 1L;
        
        public ServerVersionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
